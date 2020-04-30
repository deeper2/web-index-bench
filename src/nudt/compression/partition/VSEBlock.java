package nudt.compression.partition;

import java.util.Stack;
import java.util.Vector;

//working from 2019-12-13 to 2020-1-26
//implement according to the VSEncoding paper
//VSE-1 with layout permute and stores (k,b) tuples together
//cannot code 0 value, need to cope 0 with 1 blocksize, because docid 0
public class VSEBlock{

	int VSEBLOCKS_LENS[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
			14, 15, 16 };//16=2^4  k
	int VSEBLOCKS_ZLENS[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 32 };
	int VSEBLOCKS_CODELENS[] = {0,/*useless*/
			0/*1*/, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15/*16*/};
	int VSEBLOCKS_LOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16,
			20, 32 };//16=2^4 b
	int VSEBLOCKS_CODELOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15,
			15, 15, 15 };
	int VSEBLOCKS_REMAPLOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 16, 16, 16, 16, 20, 20, 20, 20, 32, 32, 32, 32, 32, 32, 32, 32, 32,
			32, 32, 32 };//b
	
	public void compress(int[] in, IntWrapper inpos, int inlength, byte[] out, IntWrapper outpos) {
		//inlength = (inlength / 128) * 128; // the number is rounded down
		if (inlength == 0)
			return;
		BitsWriter wt= new BitsWriter(out, outpos);
		//wt.write_bits(inlength, 32);// (edit 2/4)
		
		//compute optimal splitting vector
		int lP[] = new int[in.length + 1];// lastpositionP: P
		int mE[] = new int[in.length + 1];// minimum codeword length,E 

		//E[1]=0 P[1]=1
		lP[0] = 0;
		mE[0] = 0;
		
		int maxK = 16;//max block length for VSE, it is 28 for Simple9
		for (int index_r = 1; index_r <= in.length; index_r++) {
			int maxB = 0; mE[index_r] = Integer.MAX_VALUE;
			int mleft = (index_r > maxK)? index_r - maxK : 0;
			//jcheck:j, index:i, bitwidth:b, 
			for (int l = 0 ,jcheck_l = index_r - 1; jcheck_l >= mleft; jcheck_l--) {
				if((index_r - jcheck_l)!=VSEBLOCKS_LENS[l])
					continue;
				assert l < VSEBLOCKS_LENS.length;
				l++;
				int log2x = VSEBLOCKS_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[jcheck_l])];
				//int log2x2 = 32 - Integer.numberOfLeadingZeros(log2x);
				if (maxB < log2x)
					maxB = log2x;
				// cost function, c(j,i), wrong
				//int blockbits = (index - jcheck) * bitwidth + 8;//
				int blockbytes = ((index_r - jcheck_l) * maxB + 7)/8 + 1;//byte-aligned
				if (mE[jcheck_l] + blockbytes < mE[index_r]) {
					mE[index_r] = mE[jcheck_l] + blockbytes;
					lP[index_r] = jcheck_l;//[jcheck_l,index_r)
				}
			}	
		}
		//System.out.println("optimal partitioning vector");//right to left: P[n+1],P[P[n+1]],P[P[P[n+1]]]... ...
		int current=in.length;
		
		Stack<Integer> blocklengths= new Stack<Integer>();
		Stack<Integer> blockparts= new Stack<Integer>();//partition vector
		while(current > 0){
			blocklengths.add(current-lP[current]);//right to left
			blockparts.add(current);
			current = lP[current];
		}
		blockparts.add(current);
		int num = blocklengths.size();
		int parts[] = new int[num+1];
		for(int i = 0; i <= num; i++){
			parts[i]=blockparts.pop();
		}
		
		/* countBlocksLogs[i] says how many numbers in blocks uses i bits */
		int countBlocksLogs[] = new int[16];
		for (int i = 0; i < 16; i++)
			countBlocksLogs[i] = 0;
		/* Count number of occs of each log */
		for (int i = 0; i < num; i++) {
			/* Compute max B in the block */
			int maxB = 0;
			for (int j = parts[i]; j < parts[i + 1]; j++) {
				int bitwidth = VSEBLOCKS_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[j])];
				if (maxB < bitwidth)
					maxB = bitwidth;
			}
			countBlocksLogs[VSEBLOCKS_CODELOGS[maxB]] += parts[i + 1] - parts[i];
		}
		
		int ntotal = 0;
		for (int i = 1; i < 16; i++) {
			if (countBlocksLogs[i] > 0)
				ntotal++;// number of block length occurred
		}
		wt.write_bits(ntotal, 32);
		
		for (int i = 1; i < 16; i++) {
			if (countBlocksLogs[i] > 0) {
				wt.write_bits(countBlocksLogs[i], 28);//K
				wt.write_bits(i, 4);//b
			}
		}// K(adding all k with bit width b)and b
		
		/* Prepare arrays to store groups of elements */
		Vector<Integer> blocks[] = new Vector[16];
		for (int i = 1; i < 16; i++) {
			if (countBlocksLogs[i] > 0)
				blocks[i] = new Vector<Integer>(countBlocksLogs[i]);
		}

		/* Permute the elements based on their values of B */
		for (int i = 0; i < num; i++) {
			/* Compute max B in the block */
			int maxB = 0;
			for (int j = parts[i]; j < parts[i + 1]; j++) {
				int bitwidth = VSEBLOCKS_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[j])];
				if (maxB < bitwidth)
					maxB = bitwidth;
			}
			if (maxB == 0)
				continue;

			for (int j = parts[i]; j < parts[i + 1]; j++)
				/* Save current element in its bucket */
				blocks[VSEBLOCKS_CODELOGS[maxB]].add(in[j]);// blocks stores
															// 'in' array
		} // end permute

		/* Write each bucket ... keeping byte alignment */
		for (int i = 1; i < 16; i++) {// for each bit width i
			for (int j = 0; j < countBlocksLogs[i]; j++)// for all numbers of this bit width
				//VSEBLOCKS_LOGS[i] is the real bit width
				wt.write_bits(blocks[i].elementAt(j), VSEBLOCKS_LOGS[i]);
			wt.flush_bits();// 8-bit aligned
			//System.out.println(outpos.get());
		}
		  
		//coding all (k,b) tuples by its original order
		int blocksize = 0;//k
		for(int i = 0; i < in.length; i += blocksize){
			int maxB = 0;//b
			blocksize = blocklengths.pop();
			int bi=0;
			while(bi < blocksize){
				//32 - MSB32(in[i]) is the bit width of in[i]
				int log2x = VSEBLOCKS_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[i + bi++])];
				if (maxB < log2x)
					maxB = log2x;
			}

			wt.write_bits(VSEBLOCKS_CODELENS[blocksize], 4);
			wt.write_bits(VSEBLOCKS_CODELOGS[maxB], 4);
			wt.flush_bits();
		}
		//System.out.println(outpos.get());
	}
	
	public void uncompress(byte[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		//System.out.println();
		if (inlength == 0)
			return;
		int tmpinpos = inpos.get();
/*		final int outlength2 = (in[tmpinpos+3] & 0x000000FF) | ((in[tmpinpos+2] & 0x000000FF) << 8)
				| ((in[tmpinpos+1] & 0x000000FF) << 16) | ((in[tmpinpos] & 0x000000FF) << 24);
		tmpinpos+=4;//(edit 1/4)
*/		int ntotal = (in[tmpinpos+3] & 0x000000FF) | ((in[tmpinpos+2] & 0x000000FF) << 8)
				| ((in[tmpinpos+1] & 0x000000FF) << 16) | ((in[tmpinpos] & 0x000000FF) << 24);
		tmpinpos+=4;
		//inpos.add(8 + ntotal*4);//data area
		inpos.add(4 + ntotal*4);//data area

		int blocks[][] = new int[16][];
		int bindex[]=new int[16];//stores the current position in a bit list
		for(int i = 0; i < ntotal; i++){
			int Kbtuple = (in[tmpinpos+3] & 0x000000FF) | ((in[tmpinpos+2] & 0x000000FF) << 8)
					| ((in[tmpinpos+1] & 0x000000FF) << 16) | ((in[tmpinpos] & 0x000000FF) << 24);
			tmpinpos+=4;
			int blocksize = (Kbtuple >> 4) & 0x0FFFFFFF;
			int codeb = Kbtuple & 0x0000000F;
			blocks[codeb] = new int[blocksize + 7];
			BytePackingKBU_4Block.fastunpack(in, inpos, blocks[codeb], codeb, blocksize);
		}
		//unpermute
		tmpinpos=inpos.get();
		while (outpos.get()< outlength) {
			int kbtuple = (in[tmpinpos++] & 0x000000FF);
		
			int codeb = kbtuple & 0x0000000F;//not real bit width: b
			int blocksize = ((kbtuple >> 4) & 0x0000000F) + 1;//:k
			if(codeb==0){
				out[outpos.get()]=0;
				outpos.increment();
			}
			else
				unpermute_list(blocks, bindex, out, outpos, codeb, blocksize);
		}
		inpos.set(tmpinpos);
	}

	//need to optimize performance----for each bit list
    private void unpermute_list(int[][] blocks, int[] bindex, int[] out, IntWrapper outpos, int maxB, int blocksize) {
		int blockcurrent = bindex[maxB];
		//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(blocks[maxB], blockcurrent, out, outpos.get(), blocksize);

		bindex[maxB] = blockcurrent + blocksize;//the current position in a bit list increment
		outpos.add(blocksize);
	}

	@Override
    public String toString() {
            return this.getClass().getSimpleName();
    }
	
	// (edit 3/4)
	public void encode(int[] diffarray, byte[] docidout, int[] dcountw) {//byte[]
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		compress(diffarray, inpos, diffarray.length, docidout, outpos);//docid or freq
		dcountw[0] = outpos.get();
	}

	// (edit 4/4)
	public void decode(byte[] docfre, int[] docids, int[] freqs, int postings) {//byte
		// 输入docfre,以及有效的元素个数endOffset,解压为docids和freqs两个数组,每个有postings+1([0, postings])个元素
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, docids, outpos, postings + 1);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, freqs, outpos, postings + 1);
	}
}
