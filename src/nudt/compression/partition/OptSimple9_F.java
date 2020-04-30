package nudt.compression.partition;


/**
 * opt-simple-9 needs carefully debugging dynamic programming store the total
 * integer number avoiding 27 1s store in 28*1bit slot
 */
public final class OptSimple9_F{


	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int inOffset = inpos.get();
		int outOffset = outpos.get();
		// int outlength = in[i_inpos++]; (edit 1/4)
		// didnot store raw integer number in in[0]
		// but the index entry in lexicon store this number instead
		//final int finalout = outOffset + in[inOffset++];
		while (outOffset < outlength) {
			int val = in[inOffset++];
			int header = val >>> 28;
			switch (header) {
			case 0: { // number : 28, bitwidth : 1
				decode0(val, out, outOffset);
				outOffset+=28;
				break;
			}
			case 1: { // number : 14, bitwidth : 2
				decode1(val, out, outOffset);
				outOffset+=14;
				break;
			}
			case 2: { // number : 9, bitwidth : 3
				decode2(val, out, outOffset);
				outOffset+=9;
				break;
			}
			case 3: { // number : 7, bitwidth : 4
				decode3(val, out, outOffset);
				outOffset+=7;
				break;
			}
			case 4: { // number : 5, bitwidth : 5
				decode4(val, out, outOffset);
				outOffset+=5;
				break;
			}
			case 5: { // number : 4, bitwidth : 7
				decode5(val, out, outOffset);
				outOffset+=4;
				break;
			}
			case 6: { // number : 3, bitwidth : 9
				decode6(val, out, outOffset);
				outOffset+=3;
				break;
			}
			case 7: { // number : 2, bitwidth : 14
				decode7(val, out, outOffset);
				outOffset+=2;
				break;
			}
			case 8: { // number : 1, bitwidth : 28
				decode8(val, out, outOffset);
				outOffset+=1;
				break;
			}
			default: {
				throw new RuntimeException("shouldn't happen: limited to 28-bit integers");
			}
			}
		}
		inpos.set(inOffset);
		outpos.set(outlength);
	}

	private static void decode8(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 4) >>> 4;
	}

	private static void decode7(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 18) >>> 18;
		out[outOffset++] = (val << 4) >>> 18;
	}
	
	private static void decode6(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 23) >>> 23;
		out[outOffset++] = (val << 14) >>> 23;
		out[outOffset++] = (val << 5) >>> 23;
	}

	private static void decode5(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 25) >>> 25;
		out[outOffset++] = (val << 18) >>> 25;
		out[outOffset++] = (val << 11) >>> 25;
		out[outOffset++] = (val << 4) >>> 25;
	}

	private static void decode4(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 27) >>> 27;
		out[outOffset++] = (val << 22) >>> 27;
		out[outOffset++] = (val << 17) >>> 27;
		out[outOffset++] = (val << 12) >>> 27;
		out[outOffset++] = (val << 7) >>> 27;
	}

	private static void decode3(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 28) >>> 28;
		out[outOffset++] = (val << 24) >>> 28;
		out[outOffset++] = (val << 20) >>> 28;
		out[outOffset++] = (val << 16) >>> 28;
		out[outOffset++] = (val << 12) >>> 28;
		out[outOffset++] = (val << 8) >>> 28;
		out[outOffset++] = (val << 4) >>> 28;
	}

	private static void decode2(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 29) >>> 29;
		out[outOffset++] = (val << 26) >>> 29;
		out[outOffset++] = (val << 23) >>> 29;
		out[outOffset++] = (val << 20) >>> 29;
		out[outOffset++] = (val << 17) >>> 29;
		out[outOffset++] = (val << 14) >>> 29;
		out[outOffset++] = (val << 11) >>> 29;
		out[outOffset++] = (val << 8) >>> 29;
		out[outOffset++] = (val << 5) >>> 29;
	}

	private static void decode1(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 30) >>> 30;
		out[outOffset++] = (val << 28) >>> 30;
		out[outOffset++] = (val << 26) >>> 30;
		out[outOffset++] = (val << 24) >>> 30;
		out[outOffset++] = (val << 22) >>> 30;
		out[outOffset++] = (val << 20) >>> 30;
		out[outOffset++] = (val << 18) >>> 30;
		out[outOffset++] = (val << 16) >>> 30;
		out[outOffset++] = (val << 14) >>> 30;
		out[outOffset++] = (val << 12) >>> 30; // 10
		out[outOffset++] = (val << 10) >>> 30;
		out[outOffset++] = (val << 8) >>> 30;
		out[outOffset++] = (val << 6) >>> 30;
		out[outOffset++] = (val << 4) >>> 30;
	}

	private static void decode0(int val, int[] out, int outOffset) {
		out[outOffset++] = (val << 31) >>> 31;
		out[outOffset++] = (val << 30) >>> 31;
		out[outOffset++] = (val << 29) >>> 31;
		out[outOffset++] = (val << 28) >>> 31;
		out[outOffset++] = (val << 27) >>> 31;
		out[outOffset++] = (val << 26) >>> 31;
		out[outOffset++] = (val << 25) >>> 31;
		out[outOffset++] = (val << 24) >>> 31;
		out[outOffset++] = (val << 23) >>> 31;
		out[outOffset++] = (val << 22) >>> 31; // 10
		out[outOffset++] = (val << 21) >>> 31;
		out[outOffset++] = (val << 20) >>> 31;
		out[outOffset++] = (val << 19) >>> 31;
		out[outOffset++] = (val << 18) >>> 31;
		out[outOffset++] = (val << 17) >>> 31;
		out[outOffset++] = (val << 16) >>> 31;
		out[outOffset++] = (val << 15) >>> 31;
		out[outOffset++] = (val << 14) >>> 31;
		out[outOffset++] = (val << 13) >>> 31;
		out[outOffset++] = (val << 12) >>> 31; // 20
		out[outOffset++] = (val << 11) >>> 31;
		out[outOffset++] = (val << 10) >>> 31;
		out[outOffset++] = (val << 9) >>> 31;
		out[outOffset++] = (val << 8) >>> 31;
		out[outOffset++] = (val << 7) >>> 31;
		out[outOffset++] = (val << 6) >>> 31;
		out[outOffset++] = (val << 5) >>> 31;
		out[outOffset++] = (val << 4) >>> 31;
	}
	

	public void compress(int[] in, IntWrapper inpos, int inlength, int out[], IntWrapper outpos) {
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list
		// out[i_outpos++] = inlength;//no-use for simple index compression
		// (edit 2/4)
		
		int lastchunksize[] = new int[in.length + 1];// last block length, maybe useless
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
				//cost function adds extra 1
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
	// (edit 3/4)
	public void encode(int[] diffarray, int[] docidout, int[] dcountw) {
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		compress(diffarray, inpos, diffarray.length, docidout, outpos);
		dcountw[0] = outpos.get();
	}

	// (edit 4/4)
	public void decode(int[] docfre, int[] docids, int[] freqs, int postings) {
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