package nudt.compression.mine;


//only used to compress two successive integer sequence into one codeword sequence
public final class Simple16Coding4SkipSimple {
	
	/**
	 * @param in 输入被压缩数组
	 * @param out 输出out数组
	 * @return 返回out数组中有效元素的个数
	 * @see 可能要经过多次simple9压缩
	 * */
	public void encode(final int[] in, final int inlength, final int out[],final int a[]) {
		int outpos = 0;
		int currentPos = 0;//压缩了多少个in中的数字了
		while (currentPos < inlength) {
			//返回一次压缩了多少个in中的数字inoffset,然后把这个数字加在in的当前索引上
			int inoffset = compressblock(in, currentPos,out, outpos++);
			if (inoffset == -1)
				throw new RuntimeException("Too big a number");
			currentPos += inoffset;
		}
		a[0]=outpos;//返回压缩的word个数，out的有效元素
	}

	/**
	 * Compress an integer array using Simple16 once
	 * 
	 * @param out
	 *            the compressed output
	 * @param outOffset
	 *            the offset of the output in the number of integers
	 * @param in
	 *            the integer input array
	 * @param inOffset
	 *            the offset of the input in the number of integers
	 * @return the size of the outputs in 32-bit integers
	 * 
	 */
	public static final int compressblock(int[] in, int inOffset, int[] out, int outOffset) {
		int rest = in.length-inOffset;//the number of elements to be compressed
		//从第1种情况(1bits*28)到第16种情况(28bits*1)分别检测
		for (int numIdx = 0; numIdx < 16; numIdx++) {
			out[outOffset] = numIdx << 28;//selector放在头部
			//n少的话就只剩n个了，num=n
			int num = (S16_NUM[numIdx] < rest) ? S16_NUM[numIdx] : rest;

			for (int j = 0, bits = 0; (in[inOffset + j] < SHIFTED_S16_BITS[numIdx][j]); j++) {
				out[outOffset] |= (in[inOffset + j] << bits);//左移之后或在原来的数字上
				bits += S16_BITS[numIdx][j];//bits是下次的左移位数
				if (j == num-1)
					return num;	
			}
		}
		return -1;//16种情况都存不下这个数字
	}

	/**
	 * Decompress an integer array using Simple16
	 * 
	 * @param out
	 *            the decompressed output
	 * @param outOffset
	 *            the offset of the output in the number of integers
	 * @param in
	 *            the compressed input array
	 * @param inOffset
	 *            the offset of the input in the number of integers
	 * @param n
	 *            the number of elements to be compressed
	 * @return the number of processed integers
	 */
	public static final int decompressblock(int[] out, int outOffset, int[] in, int inOffset, int n) {
		int numIdx, j = 0, bits = 0;
		numIdx = in[inOffset] >>> 28;//获得头部的selector
		int num = S16_NUM[numIdx] < n ? S16_NUM[numIdx] : n;//获得此次存储的整数个数
		for (j = 0, bits = 0; j < num; j++) {
			out[outOffset + j] = (in[inOffset] >>> bits) & (0xffffffff >>> (32 - S16_BITS[numIdx][j]));
			bits += S16_BITS[numIdx][j];
		}
		return num;
	}

	//out是解压的数字，in是压缩的数字，outlength是应该要得到的解压数字个数
	public void decode(int[] docfre, int[] docids, int[] freqs, int postings) {
		int inputWord=0;//输入索引
		int currentPos=0;//输出索引
		int outlength=postings;
		while (outlength>0) {
			final int howmany = decompressblock(docids, currentPos, docfre, inputWord, outlength);
			outlength -= howmany;
			currentPos += howmany;
			inputWord ++;
		}
		currentPos=0;//输出索引
		outlength=postings;
		while (outlength>0) {
			final int howmany = decompressblock(freqs, currentPos, docfre, inputWord, outlength);
			outlength -= howmany;
			currentPos += howmany;
			inputWord ++;
		}
	}

	private static int[][] shiftme(int[][] x) {
		int[][] answer = new int[16][];//x.length==16
		for (int k = 0; k < 16; ++k) {
			answer[k] = new int[S16_NUM[k]];//
			for (int z = 0; z < S16_NUM[k]; ++z)
				answer[k][z] = 1 << x[k][z];//最大可表示的数字
		}
		return answer;
	}

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
	private static final int[][] SHIFTED_S16_BITS = shiftme(S16_BITS);//how large every selector can store
	
	public static void main(String[] args) {
		Simple16Coding4SkipSimple coder=new Simple16Coding4SkipSimple();
		int[] in = new int[256];
		int[] out = new int[256];
		for (int i = 0; i < 256; i++) {
			in[i] = i;
		}
		int[] a =new int[1];
		coder.encode(in, 256,out, a);
		System.out.println(a[0]);
		int[] docid = new int[128];
		int[] freqs = new int[128];

		coder.decode(out, docid, freqs, 128);//出错，因为256个数字是连续压缩的
		System.out.println();

	}

}
