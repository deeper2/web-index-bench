package nudt.compression.partition;


public final class OptSimple8b{
	// compress 2,13 with a byte, then store {1101(13) 0010(2)}
	public void compress(int[] in, IntWrapper inpos, int inlength, long[] out, IntWrapper outpos) {
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list
		//no-use for simple index compression (edit 2/4)

		int lastchunksize[] = new int[in.length + 1];// last block length
		int lastselector[] = new int[in.length + 1];//
		int mincodeword[] = new int[in.length + 1];// minimum codeword length

		lastchunksize[0] = 0;// useless for index 0
		lastchunksize[1] = 1;//actually this metric is useless
		lastselector[0] = 0;
		lastselector[1] = 15;// only compress itself, most 
		mincodeword[0] = 0;
		mincodeword[1] = 1;

		// compute optimal splitting from left to right
		for (int index = 2; index < in.length + 1; index++) {
			// initial state
			lastchunksize[index] = 1; // compress itself by default
			lastselector[index] = 15;// compress itself by default
			mincodeword[index] = mincodeword[index - 1] + 1;// compress itself
															// by default
			mainloop: for (int selector = 0; selector < S8b_NUMSIZE; selector++) {
				// check every padding mode backward
				int compressedNum = S8b_NUM[selector];
				if ((index - compressedNum) < 0) {
					continue mainloop;// break;
				}

				for (int i = 0; i < compressedNum; i++) {
					if (SHIFTED_S8b_BITS[selector][compressedNum - i - 1] <= in[index - i - 1])
						continue mainloop;
				}

				if ((mincodeword[index - compressedNum] + 1) < mincodeword[index]) {
					mincodeword[index] = mincodeword[index - compressedNum] + 1;
					lastchunksize[index] = compressedNum;
					lastselector[index] = selector;
					//break mainloop;
					// do not need to consider the left padding mode with less
					// chunksize(compressedNum)?
				}
			}
		}

		// coding with the optimal splitting from right to left
		currentPos = in.length;// right side
		tmpoutpos += mincodeword[in.length] - 1;// last codeword index
		inpos.set(currentPos);
		outpos.set(tmpoutpos + 1);
		while (currentPos > 0) {
			int selector = lastselector[currentPos];
			long res = 0;
			int compressedNum = S8b_NUM[selector];
			

			for (int i = 0; i < compressedNum; i++) {
				res = (res << S8b_BITS[selector][i]) + in[currentPos - i -1];
			}//compress 2,13 with a byte, then store {1101(13) 0010(2)}
			res |= (long)selector << 60;
			out[tmpoutpos--] = res;
			currentPos -= compressedNum;
		}
	}

	public void uncompress(long[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int i_inpos = inpos.get();
		int i_outpos = outpos.get();
		//int outlength = (int) in[i_inpos++];(edit 1/4)
		//didnot store raw integer number in in[0]
		//but the index entry in lexicon store this number instead

		while (outlength > 0) {
			final long howmany = decompressblock(out, i_outpos, in, i_inpos, outlength);
			outlength -= howmany;
			i_outpos += howmany;
			i_inpos++;
		}
		inpos.set(i_inpos);
		outpos.set(i_outpos);
	}

	public static final long decompressblock(int[] out, int outOffset, long[] in, int inOffset, int n) {
		int j = 0, bits = 0;
		int numIdx = (int) (in[inOffset] >>> S8b_BITSSIZE);// padding mode index
		int num = S8b_NUM[numIdx] < n ? S8b_NUM[numIdx] : n;
		for (j = 0, bits = 0; j < num; j++) {
			out[outOffset + j] = (int) ((in[inOffset] >>> bits) & (0xffffffffffffffffL >>> (64 - S8b_BITS[numIdx][j])));
			bits += S8b_BITS[numIdx][j];
		}
		return num;
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

	private static final int S8b_NUMSIZE = 16;
	private static final int S8b_BITSSIZE = 60;
	// the possible number of bits used to represent one integer
	private static final int[] S8b_NUM = { 240, 120, 60, 30, 20, 15, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1 };
	// the corresponding number of elements for each value of the number of bits
	private static final int[][] S8b_BITS = {
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }, // 240,120
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
			{ 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 },
			{ 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 }, { 7, 7, 7, 7, 7, 7, 7, 7 }, { 8, 8, 8, 8, 8, 8, 8 },
			{ 10, 10, 10, 10, 10, 10 }, { 12, 12, 12, 12, 12 }, { 15, 15, 15, 15 }, { 20, 20, 20 }, { 30, 30 },
			{ 60 } };
	private static final int[][] SHIFTED_S8b_BITS = shiftme(S8b_BITS);

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	//(edit 3/4)
	public void encode(int[] diffarray, long[] docidout, int[]dcountw) {
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		compress(diffarray, inpos, diffarray.length, docidout, outpos);
		dcountw[0]=outpos.get();
	}

	//(edit 4/4)
	public void decode(long[] docfre, int[] docids, int[] freqs, int postings) {
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