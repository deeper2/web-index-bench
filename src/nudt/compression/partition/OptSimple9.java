package nudt.compression.partition;


/**
 * opt-simple-9 needs carefully debugging dynamic programming store the total
 * integer number avoiding 27 1s store in 28*1bit slot
 */
public final class OptSimple9{
	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int i_inpos = inpos.get();
		int i_outpos = outpos.get();
		//int outlength = in[i_inpos++]; (1)
				//didnot store raw integer number in in[0]
				//but the index entry in lexicon store this number instead
		while (outlength > 0) {
			final int howmany = decompressblock(out, i_outpos, in, i_inpos, outlength);
			outlength -= howmany;
			i_outpos += howmany;
			i_inpos++;
		}
		inpos.set(i_inpos);
		outpos.set(i_outpos);
	}
	
	public static final int decompressblock(int[] out, int outOffset, int[] in, int inOffset, int n) {
		int numIdx, j = 0, bits = 0;
		numIdx = in[inOffset] >>> S9_BITSSIZE;
		int num = S9_NUM[numIdx] < n ? S9_NUM[numIdx] : n;
		for (j = 0, bits = 0; j < num; j++) {
			out[outOffset + j] = (in[inOffset] >>> bits) & (0xffffffff >>> (32 - S9_BITS[numIdx][j]));
			bits += S9_BITS[numIdx][j];
		}
		return num;
	}
	
	public void compress(int[] in, IntWrapper inpos, int inlength, int out[], IntWrapper outpos) {
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list (2)

		int lastchunksize[] = new int[in.length + 1];// last block length
		int lastselector[] = new int[in.length + 1];//
		int mincodeword[] = new int[in.length + 1];// minimum codeword length

		lastchunksize[0] = 0;
		lastchunksize[1] = 1;
		lastselector[0] = 0;
		lastselector[1] = 8;//only compress itself
		mincodeword[0] = 0;
		mincodeword[1] = 1;
		
		//compute optimal splitting from left to right
		for (int index = 2; index < in.length + 1; index++) {
			// initial state
			lastchunksize[index] = 1; // compress itself by default
			lastselector[index] = 8;// compress itself by default
			mincodeword[index] = mincodeword[index - 1] + 1;// compress itself by default
			mainloop: for (int selector = 0; selector < 9; selector++) {//check every padding mode backward
				int compressedNum = S9_NUM[selector];
				if ((index - compressedNum) < 0) {
					continue mainloop;// break;
				}
				
				// max presented num possible
/*				for (int i = 0; i < compressedNum; i++) {
					if ((1 << bitLength[selector] <= in[index - i - 1])
						continue mainloop;
				}*/
				
				for (int i = 0; i < compressedNum; i++) {
					if (SHIFTED_S9_BITS[selector][compressedNum-i-1] <= in[index - i - 1])
						continue mainloop;
				}
				
				if ((mincodeword[index - compressedNum] + 1) < mincodeword[index]) {
					mincodeword[index] = mincodeword[index - compressedNum] + 1;
					lastchunksize[index] = compressedNum;
					lastselector[index] = selector;
					break mainloop;
					//do not need to consider the left padding mode with less chunksize(compressedNum)
				}
			}
		}
		
		//coding with the optimal splitting from right to left
		currentPos = in.length;
		tmpoutpos += mincodeword[in.length] - 1;
		inpos.set(currentPos);
		outpos.set(tmpoutpos + 1);
		while (currentPos > 0) {
			int selector = lastselector[currentPos];
			int res = 0;
			int compressedNum = S9_NUM[selector];
			currentPos -= compressedNum;
			
			//compress 2,13 with a byte, then store {1101(13) 0010(2)}
			for (int j = 0, bits = 0; j < compressedNum; j++) {
				res |= (in[currentPos + j] << bits);
				bits += S9_BITS[selector][j];
			}
			
			res |= selector << 28;
			out[tmpoutpos--] = res;
		}
	}
	private static int[][] shiftme(int[][] x) {
		int[][] answer = new int[x.length][];
		for (int k = 0; k < x.length; ++k) {
			answer[k] = new int[x[k].length];
			for (int z = 0; z < answer[k].length; ++z)
				answer[k][z] = 1 << x[k][z];
		}
		return answer;
	}

	private static final int S9_BITSSIZE = 28;
	// the possible number of bits used to represent one integer
	private static final int[] S9_NUM = { 28, 14, 9, 7, 5, 4, 3, 2, 1 };
	// the corresponding number of elements for each value of the number of bits
	private static final int[][] S9_BITS = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3, 3, 3, 3, 3 },
			{ 4, 4, 4, 4, 4, 4, 4 },{ 5, 5, 5, 5, 5 }, { 7, 7, 7, 7 }, 
			{ 9, 9, 9, }, { 14, 14 }, { 28 } };
	private static final int[][] SHIFTED_S9_BITS = shiftme(S9_BITS);	

	private final static int bitLength[] = { 1, 2, 3, 4, 5, 7, 9, 14, 28 };

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	//(3)
	public void encode(int[] diffarray, int[] docidout, int[]dcountw) {
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		compress(diffarray, inpos, diffarray.length, docidout, outpos);
		dcountw[0]=outpos.get();
	}

	//(4)
	public void decode(int[] docfre, int[] docids, int[] freqs, int postings) {
		//输入docfre,以及有效的元素个数endOffset,解压为docids和freqs两个数组,每个有postings+1个元素
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		uncompress(docfre,inpos,docfre.length, docids,outpos,postings+1);
		outpos.set(0);
		uncompress(docfre,inpos,docfre.length, freqs,outpos,postings+1);
	}
}