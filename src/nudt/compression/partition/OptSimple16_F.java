package nudt.compression.partition;


public final class OptSimple16_F{
	// compress 2,13 with a byte, then store {1101(13) 0010(2)}

	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		
		int currentPos = outpos.get();
		int tmpinpos = inpos.get();
		// int outlength = in[i_inpos++]; (edit 1/4)
		// didnot store raw integer number in in[0]
		// but the index entry in lexicon store this number instead
		//final int finalout = outOffset + in[inOffset++];
		while (currentPos < outlength) {
			int val = in[tmpinpos];
			int header = val >>> 28;
			switch (header) {
			case 0:
				decode0(val, out, currentPos);
				currentPos+=28;
				break;
			case 1: 
				decode1(val, out, currentPos);
				currentPos+=21;
				break;
			case 2:
				decode2(val, out, currentPos);
				currentPos+=21;
				break;
			case 3:
				decode3(val, out, currentPos);
				currentPos+=21;
				break;
			case 4: 
				decode4(val, out, currentPos);
				currentPos+=14;
				break;
			case 5:
				decode5(val, out, currentPos);
				currentPos+=9;
				break;
			case 6: 
				decode6(val, out, currentPos);
				currentPos+=8;
				break;
			case 7: 
				decode7(val, out, currentPos);
				currentPos+=7;
				break;
			case 8:
				decode8(val, out, currentPos);
				currentPos+=6;
				break;
			case 9:
				decode9(val, out, currentPos);
				currentPos+=6;
				break;
			case 10: 
				decode10(val, out, currentPos);
				currentPos+=5;
				break;
			case 11: 
				decode11(val, out, currentPos);
				currentPos+=5;
				break;
			case 12:
				decode12(val, out, currentPos);
				currentPos+=4;
				break;
			case 13: 
				decode13(val, out, currentPos);
				currentPos+=3;
				break;
			case 14: 
				decode14(val, out, currentPos);
				currentPos+=2;
				break;
			case 15: 
				decode15(val, out, currentPos);
				currentPos+=1;
				break;
			}
			tmpinpos++;
		}
		outpos.set(outlength);
		inpos.set(tmpinpos);
	}

	private void decode15(int val, int[] out, int currentPos) {
		// { 28 }
		// number : 1, bitwidth : 28
		out[currentPos++] = (val << 4) >>> 4;
	}

	private void decode14(int val, int[] out, int currentPos) {
		// { 14, 14 } 
		// number : 2, bitwidth : 14
		out[currentPos++] = (val << 18) >>> 18;
		out[currentPos++] = (val << 4) >>> 18;
	}

	private void decode13(int val, int[] out, int currentPos) {
		// { 10, 9, 9, }
		// number : 3, bitwidth : 9
		out[currentPos++] = (val << 22) >>> 22;

		out[currentPos++] = (val << 13) >>> 23;
		out[currentPos++] = (val << 4) >>> 23;
	}

	private void decode12(int val, int[] out, int currentPos) {
		// { 7, 7, 7, 7 }
		// number : 4, bitwidth : 7
		out[currentPos++] = (val << 25) >>> 25;
		out[currentPos++] = (val << 18) >>> 25;
		out[currentPos++] = (val << 11) >>> 25;
		out[currentPos++] = (val << 4) >>> 25;
	}

	private void decode11(int val, int[] out, int currentPos) {
		// { 5, 5, 6, 6, 6 }
		// number : 5, bitwidth : 5
		out[currentPos++] = (val << 27) >>> 27;
		out[currentPos++] = (val << 22) >>> 27;

		out[currentPos++] = (val << 16) >>> 26;
		out[currentPos++] = (val << 10) >>> 26;
		out[currentPos++] = (val << 4) >>> 26;
	}

	private void decode10(int val, int[] out, int currentPos) {
		// { 6, 6, 6, 5, 5 }
		// number : 5, bitwidth : 5
		out[currentPos++] = (val << 26) >>> 26;
		out[currentPos++] = (val << 20) >>> 26;
		out[currentPos++] = (val << 14) >>> 26;
		
		out[currentPos++] = (val << 9) >>> 27;
		out[currentPos++] = (val << 4) >>> 27;
	}

	private void decode9(int val, int[] out, int currentPos) {
		// { 4, 4, 5, 5, 5, 5 }
		// number : 5, bitwidth : 5
		out[currentPos++] = (val << 28) >>> 28;
		out[currentPos++] = (val << 24) >>> 28;

		out[currentPos++] = (val << 19) >>> 27;
		out[currentPos++] = (val << 14) >>> 27;
		out[currentPos++] = (val << 9) >>> 27;
		out[currentPos++] = (val << 4) >>> 27;
	}

	private void decode8(int val, int[] out, int currentPos) {
		// { 5, 5, 5, 5, 4, 4 }
		// number : 5, bitwidth : 5
		out[currentPos++] = (val << 27) >>> 27;
		out[currentPos++] = (val << 22) >>> 27;
		out[currentPos++] = (val << 17) >>> 27;
		out[currentPos++] = (val << 12) >>> 27;

		out[currentPos++] = (val << 8) >>> 28;
		out[currentPos++] = (val << 4) >>> 28;
	}

	private void decode7(int val, int[] out, int currentPos) {
		// { 4, 4, 4, 4, 4, 4, 4 }
		// number : 7, bitwidth : 4
		out[currentPos++] = (val << 28) >>> 28;
		out[currentPos++] = (val << 24) >>> 28;
		out[currentPos++] = (val << 20) >>> 28;
		out[currentPos++] = (val << 16) >>> 28;
		out[currentPos++] = (val << 12) >>> 28;
		out[currentPos++] = (val << 8) >>> 28;
		out[currentPos++] = (val << 4) >>> 28;
	}

	private void decode6(int val, int[] out, int currentPos) {
		//  { 3, 4, 4, 4, 4, 3, 3, 3 },
		
		// number : 9, bitwidth : 3
		out[currentPos++] = (val << 29) >>> 29;

		out[currentPos++] = (val << 25) >>> 28;
		out[currentPos++] = (val << 21) >>> 28;
		out[currentPos++] = (val << 17) >>> 28;
		out[currentPos++] = (val << 13) >>> 28;

		out[currentPos++] = (val << 10) >>> 29;
		out[currentPos++] = (val << 7) >>> 29;
		out[currentPos++] = (val << 4) >>> 29;
	}

	private void decode5(int val, int[] out, int currentPos) {
		// { 4, 3, 3, 3, 3, 3, 3, 3, 3 } 
		// number : 9, bitwidth : 3
		out[currentPos++] = (val << 28) >>> 28;

		out[currentPos++] = (val << 25) >>> 29;
		out[currentPos++] = (val << 22) >>> 29;
		out[currentPos++] = (val << 19) >>> 29;
		out[currentPos++] = (val << 16) >>> 29;
		out[currentPos++] = (val << 13) >>> 29;
		out[currentPos++] = (val << 10) >>> 29;
		out[currentPos++] = (val << 7) >>> 29;
		out[currentPos++] = (val << 4) >>> 29;
	}

	private void decode4(int val, int[] out, int outOffset) {
		// number : 14, bitwidth : 2		
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

	private void decode3(int val, int[] out, int currentPos) {
		//{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 }
		// number : 14, bitwidth : 1
		// number : 7, bitwidth : 2
		out[currentPos++] = (val << 31) >>> 31;
		out[currentPos++] = (val << 30) >>> 31;
		out[currentPos++] = (val << 29) >>> 31;
		out[currentPos++] = (val << 28) >>> 31;
		out[currentPos++] = (val << 27) >>> 31;
		out[currentPos++] = (val << 26) >>> 31;
		out[currentPos++] = (val << 25) >>> 31;
		out[currentPos++] = (val << 24) >>> 31;
		out[currentPos++] = (val << 23) >>> 31;
		out[currentPos++] = (val << 22) >>> 31;
		out[currentPos++] = (val << 21) >>> 31;
		out[currentPos++] = (val << 20) >>> 31;
		out[currentPos++] = (val << 19) >>> 31;
		out[currentPos++] = (val << 18) >>> 31;

		out[currentPos++] = (val << 16) >>> 30;
		out[currentPos++] = (val << 14) >>> 30;
		out[currentPos++] = (val << 12) >>> 30;
		out[currentPos++] = (val << 10) >>> 30;
		out[currentPos++] = (val << 8) >>> 30;
		out[currentPos++] = (val << 6) >>> 30;
		out[currentPos++] = (val << 4) >>> 30;
	}

	private void decode2(int val, int[] out, int currentPos) {
		//{ 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 }
		// number : 7, bitwidth : 1
		// number : 7, bitwidth : 2
		// number : 7, bitwidth : 1
		out[currentPos++] = (val << 31) >>> 31;
		out[currentPos++] = (val << 30) >>> 31;
		out[currentPos++] = (val << 29) >>> 31;
		out[currentPos++] = (val << 28) >>> 31;
		out[currentPos++] = (val << 27) >>> 31;
		out[currentPos++] = (val << 26) >>> 31;
		out[currentPos++] = (val << 25) >>> 31;
		
		out[currentPos++] = (val << 23) >>> 30;
		out[currentPos++] = (val << 21) >>> 30;
		out[currentPos++] = (val << 19) >>> 30;
		out[currentPos++] = (val << 17) >>> 30;
		out[currentPos++] = (val << 15) >>> 30;
		out[currentPos++] = (val << 13) >>> 30;
		out[currentPos++] = (val << 11) >>> 30;
		
		out[currentPos++] = (val << 10) >>> 31;
		out[currentPos++] = (val << 9) >>> 31;
		out[currentPos++] = (val << 8) >>> 31;
		out[currentPos++] = (val << 7) >>> 31;
		out[currentPos++] = (val << 6) >>> 31;
		out[currentPos++] = (val << 5) >>> 31;
		out[currentPos++] = (val << 4) >>> 31;
	}

	private void decode1(int val, int[] out, int currentPos) {
		// { 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
		// number : 7, bitwidth : 2
		// number : 14, bitwidth : 1
		out[currentPos++] = (val << 30) >>> 30;
		out[currentPos++] = (val << 28) >>> 30;
		out[currentPos++] = (val << 26) >>> 30;
		out[currentPos++] = (val << 24) >>> 30;
		out[currentPos++] = (val << 22) >>> 30;
		out[currentPos++] = (val << 20) >>> 30;
		out[currentPos++] = (val << 18) >>> 30;

		
		out[currentPos++] = (val << 17) >>> 31;
		out[currentPos++] = (val << 16) >>> 31;
		out[currentPos++] = (val << 15) >>> 31;
		out[currentPos++] = (val << 14) >>> 31;
		out[currentPos++] = (val << 13) >>> 31;
		out[currentPos++] = (val << 12) >>> 31;
		out[currentPos++] = (val << 11) >>> 31;
		out[currentPos++] = (val << 10) >>> 31;
		out[currentPos++] = (val << 9) >>> 31;
		out[currentPos++] = (val << 8) >>> 31;
		out[currentPos++] = (val << 7) >>> 31;
		out[currentPos++] = (val << 6) >>> 31;
		out[currentPos++] = (val << 5) >>> 31;
		out[currentPos++] = (val << 4) >>> 31;
	}

	private void decode0(int val, int[] out, int outOffset) {
		// TODO Auto-generated method stub
		// number : 28, bitwidth : 1
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
	

	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list
		// out[i_outpos++] = inlength;//no-use for simple index compression
		// (edit 2/4)

		int lastchunksize[] = new int[in.length + 1];// last block length
		int lastselector[] = new int[in.length + 1];//
		int mincodeword[] = new int[in.length + 1];// minimum codeword length

		lastchunksize[0] = 0;//useless for index 0
		lastchunksize[1] = 1;
		lastselector[0] = 0;
		lastselector[1] = 15;//only compress itself
		mincodeword[0] = 0;
		mincodeword[1] = 1;
		
		//compute optimal splitting from left to right
		for (int index = 2; index < in.length + 1; index++) {
			// initial state
			lastchunksize[index] = 1; // compress itself by default
			lastselector[index] = 15;// compress itself by default
			mincodeword[index] = mincodeword[index - 1] + 1;// compress itself by default
			mainloop: for (int selector = 0; selector < 15; selector++) {//check every padding mode backward
				int compressedNum = S16_NUM[selector];
				if ((index - compressedNum) < 0) {
					continue mainloop;// break;
				}

				for (int i = 0; i < compressedNum; i++) {
					if (SHIFTED_S16_BITS[selector][compressedNum-i-1] <= in[index - i - 1])
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
		currentPos = in.length;//right side
		tmpoutpos += mincodeword[in.length] - 1;//last codeword index
		inpos.set(currentPos);
		outpos.set(tmpoutpos + 1);
		while (currentPos > 0) {
			int selector = lastselector[currentPos];
			int res = 0;
			int compressedNum = S16_NUM[selector];
			currentPos -= compressedNum;			
			
			//compress 2,13 with a byte, then store {1101(13) 0010(2)}
			for (int j = 0, bits = 0; j < compressedNum;j++) {
				res |= (in[currentPos + j] << bits);
				bits += S16_BITS[selector][j];
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

	private static final int S16_BITSSIZE = 28;
	// the possible number of bits used to represent one integer
	private static final int[] S16_NUM = { 28, 21, 21, 21, 14, 9, 8, 7, 6, 6, 5, 5, 4, 3, 2, 1 };
	// the corresponding number of elements for each value of the number of bits
	private static final int[][] S16_BITS = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 4, 3, 3, 3, 3, 3, 3, 3, 3 }, { 3, 4, 4, 4, 4, 3, 3, 3 },
			{ 4, 4, 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 4, 4 }, { 4, 4, 5, 5, 5, 5 }, { 6, 6, 6, 5, 5 }, { 5, 5, 6, 6, 6 },
			{ 7, 7, 7, 7 }, { 10, 9, 9, }, { 14, 14 }, { 28 } };
	private static final int[][] SHIFTED_S16_BITS = shiftme(S16_BITS);
	
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