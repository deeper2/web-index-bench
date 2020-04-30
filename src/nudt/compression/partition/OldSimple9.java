package nudt.compression.partition;

/**
 * opt-simple-9 needs carefully debugging dynamic programming store the total
 * integer number avoiding 27 1s store in 28*1bit slot
 */
public final class OldSimple9 {
	
	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int i_inpos = inpos.get();
		int i_outpos = outpos.get();
		// int outlength = in[i_inpos++]; (edit 1/4)
		// didnot store raw integer number in in[0]
		// but the index entry in lexicon store this number instead
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
		for (j = 0, bits = 0; j < num; j++) {//no more decoded number
			out[outOffset + j] = (in[inOffset] >>> bits) & (0xffffffff >>> (32 - S9_BITS[numIdx][j]));
			bits += S9_BITS[numIdx][j];
		}
		return num;
	}
	
	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
		if (inlength == 0)
			return;
		int i_inpos = inpos.get();
		int i_outpos = outpos.get();
		// out[i_outpos++] = inlength;//no-use for simple index compression
		// (edit 2/4)

		final int finalin = i_inpos + inlength;
		while (i_inpos < finalin) {
			int inoffset = compressblock(out, i_outpos++, in, i_inpos, inlength);
			if (inoffset == -1)
				throw new RuntimeException("Too big a number");
			i_inpos += inoffset;
			inlength -= inoffset;
			//System.out.println(i_inpos);
		}
		inpos.set(i_inpos);
		outpos.set(i_outpos);
	}

	public static final int compressblock(int[] out, int outOffset, int[] in, int inOffset, int n) {
		int numIdx, j, num, bits;
		for (numIdx = 0; numIdx < S9_NUMSIZE; numIdx++) {
			out[outOffset] = numIdx << S9_BITSSIZE;
			num = (S9_NUM[numIdx] < n) ? S9_NUM[numIdx] : n;

			for (j = 0, bits = 0; (j < num) && (in[inOffset + j] < SHIFTED_S9_BITS[numIdx][j]);) {
				out[outOffset] |= (in[inOffset + j] << bits);
				bits += S9_BITS[numIdx][j];
				j++;
			}

			if (j == num) {
				return num;
			}
		}

		return -1;
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

	private static final int S9_NUMSIZE = 16;
	private static final int S9_BITSSIZE = 28;
	// the possible number of bits used to represent one integer
	private static final int[] S9_NUM = { 28, 14, 9, 7, 5, 4, 3, 2, 1 };
	// the corresponding number of elements for each value of the number of bits
	private static final int[][] S9_BITS = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4, 4, 4 },
			{ 5, 5, 5, 5, 5 }, { 7, 7, 7, 7 }, { 9, 9, 9, }, { 14, 14 }, { 28 } };
	private static final int[][] SHIFTED_S9_BITS = shiftme(S9_BITS);

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
		// 输入docfre,以及有效的元素个数endOffset,解压为docids和freqs两个数组,每个有postings+1个元素
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, docids, outpos, postings + 1);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, freqs, outpos, postings + 1);
	}

	public static void main(String args[]) {
		int input[] = { 2, 1, 6, 1, 1, 1, 1, 1, 4, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 2, 1, 1, 2, 1, 1,
				1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 6, 2,
				2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 12, 1, 1, 12, 1, 1, 1, 1, 1, 1, 12, 5, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 5, 1, 1, 1, 2, 8, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 6, 1, 1, 1, 1, 3, 2,
				1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				4, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 40, 49, 1, 5, 1, 4, 1, 1, 1, 1,
				1, 8, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 3, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 2, 1, 2, 1, 2, 2, 3, 1, 1, 7, 1, 14, 2, 3, 2, 2, 2, 1, 4, 3, 1, 1, 4, 1, 1, 1, 1, 14, 1, 1, 2,
				7, 1, 1, 2, 40, 1, 49, 6, 2, 2, 2, 1, 1, 3, 1, 2, 1, 4, 10, 1, 14, 1, 1, 7, 2, 1, 2, 14, 2, 3, 2, 1, 51,
				2, 4, 1, 1, 1, 2, 1, 2, 5, 1 };
		int output[] = new int[352];

		int[] outputWord = { 0 };// the length of the output
		OldSimple9 coder = new OldSimple9();
		coder.encode(input, output, outputWord);

		System.out.println("length " + outputWord[0]);//37
	}

}