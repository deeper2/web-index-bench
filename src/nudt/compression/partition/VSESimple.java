package nudt.compression.partition;

import java.util.Stack;


//working from 2019-12-13 to 2020-1-26
//implement according to the VSEncoding paper
//VSE-1 without layout permute but only stores (k,b) tuples together
public class VSESimple{
	
	int VSESIMPLE_LENS[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14,
			16, 32, 64 };//16=2^4  k
	int VSESIMPLE_CODELENS[] = {0,//useless
			0/*1*/, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 12,
			0, 13,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14/*32*/,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15 /*64*/};
	
	int VSENAIVE_LOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16,
			20, 32 };//16=2^4 b
	int VSESIMPLE_CODELOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15,
			15, 15, 15 };
	int VSESIMPLE_REMAPLOGS[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 16, 16, 16, 16, 20, 20, 20, 20, 32, 32, 32, 32, 32, 32, 32, 32, 32,
			32, 32, 32 };//b
	
	public void compress(int[] in, IntWrapper inpos, int inlength, byte[] out, IntWrapper outpos) {
		//inlength = (inlength / 128) * 128; // the number is rounded down
		if (inlength == 0)
			return;
/*		out[outpos.get()] = (byte) (inlength & 0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>8)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>16)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((inlength>>24)&0xff);
		outpos.increment();*///(edit 2/4)
		
		//compute optimal splitting vector
		int lP[] = new int[in.length + 1];// lastpositionP: P
		int mE[] = new int[in.length + 1];// minimum codeword length,E 

		//E[1]=0 P[1]=1
		lP[0] = 0;
		mE[0] = 0;
		
		int maxK = 64;//max block length for VSE, it is 28 for Simple9
		for (int index_r = 1; index_r <= in.length; index_r++) {
			int maxB = 0; mE[index_r] = Integer.MAX_VALUE;
			int mleft = (index_r > maxK)? index_r - maxK : 0;
			//jcheck:j, index:i, bitwidth:b, 
			for (int l = 0 ,jcheck_l = index_r - 1; jcheck_l >= mleft; jcheck_l--) {
				if((index_r - jcheck_l)!=VSESIMPLE_LENS[l])
					continue;
				assert l < VSESIMPLE_LENS.length;
				l++;
				
				int log2x = VSESIMPLE_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[jcheck_l])];
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
		//Queue<Integer> blocksizes = new ArrayDeque<Integer>();
		while(current > 0){
			blocklengths.add(current-lP[current]);//right to left
			current = lP[current];
		}
		int num = blocklengths.size();
		out[outpos.get()] = (byte) (num & 0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((num>>8)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((num>>16)&0xff);
		outpos.increment();
		out[outpos.get()] = (byte) ((num>>24)&0xff);
		outpos.increment();
		
		//coding with the optimal splitting
		int blocksize = 0;//k
		int j=0;
		int beginpos = outpos.get();
		byte kbtmp[] = new byte[num];
		outpos.add(num);//write data slot
		
		for(int i = 0; i < in.length; i += blocksize){
			int maxB = 0;//b
			blocksize = blocklengths.pop();
			int bi=0;
			while(bi < blocksize){
				int log2x = VSESIMPLE_REMAPLOGS[32 - Integer.numberOfLeadingZeros(in[i + bi++])];
				if (maxB < log2x)
					maxB = log2x;
			}
			int index = VSESIMPLE_CODELOGS[maxB] * 16 + VSESIMPLE_CODELENS[blocksize];
			//System.out.print(index+" ");
			kbtmp[j++] = (byte) (VSESIMPLE_CODELENS[blocksize] << 4 | VSESIMPLE_CODELOGS[maxB]);//ifmaxB=64 cannot store into 4bits slot
			BytePackingKBP.fastpack(in, inpos, out, outpos, index);	
		}
		int endpos = outpos.get();
		outpos.set(beginpos);
		for (int i = 0; i < j; i++) {
			out[outpos.get()+i] = kbtmp[i];//store k,b together
		}
		outpos.set(endpos);
	}
	
	public void uncompress(byte[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int tmpinpos = inpos.get();
/*		final int outlength = (in[tmpinpos] & 0x000000FF) | ((in[tmpinpos+1] & 0x000000FF) << 8)
				| ((in[tmpinpos+2] & 0x000000FF) << 16) | ((in[tmpinpos+3] & 0x000000FF) << 24);
		tmpinpos+=4;*/ //(edit 1/4)
		int blocknum = (in[tmpinpos] & 0x000000FF) | ((in[tmpinpos+1] & 0x000000FF) << 8)
				| ((in[tmpinpos+2] & 0x000000FF) << 16) | ((in[tmpinpos+3] & 0x000000FF) << 24);
		//tmpinpos+=4;//inpos.add(8);
		inpos.add(4);
		int indexs[]=new int[blocknum];
		for(int i = 0; i < blocknum; i++){
			int maxB=VSENAIVE_LOGS[in[inpos.get()] & 0x0000000F];
			int blocksize=VSESIMPLE_LENS[(in[inpos.get()]>>4) & 0x0000000F];
			indexs[i] = VSESIMPLE_CODELOGS[maxB] * 16 + VSESIMPLE_CODELENS[blocksize];
			inpos.increment();
		}
		int j=0;
		while (outpos.get()< outlength) {
			BytePackingKBU.fastunpack(in, inpos, out, outpos, indexs[j++]);
		}
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
		compress(diffarray, inpos, diffarray.length, docidout, outpos);
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
