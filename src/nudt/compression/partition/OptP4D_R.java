/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package nudt.compression.partition;

/**
 * OptPFD: fast patching scheme by Yan et al.
 * <p/>
 * Follows:
 * <p/>
 * H. Yan, S. Ding, T. Suel, Inverted index compression and query processing
 * with optimized document ordering, in: WWW2009, pp. 401-410.
 * <p/>
 * OptP4D_Real:does not has page concept
 * 
 * @author Kun Jiang
 */
public final class OptP4D_R {
	final static int BlockSize = 128;

	int[] exceptbuffer = new int[2 * BlockSize];
	int[] sillybuffer = new int[2 * BlockSize];

	public void compress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
		if (inlength == 0)
			return;
		final int finalinpos = inpos.get() + inlength;
		// out[outpos.get()] = inlength;
		// outpos.increment();// (edit 2/4)

		int tmpinpos = inpos.get();
		int tmpoutpos = outpos.get();
		IntWrapper bestb = new IntWrapper();
		IntWrapper bestexcept = new IntWrapper();

		while (tmpinpos < finalinpos - 128) {
			getBestBFromData(in, tmpinpos, bestb, bestexcept);
			final int tmpbestb = bestb.get();
			final int nbrexcept = bestexcept.get();
			int exceptsize = 0;
			final int remember = tmpoutpos;
			tmpoutpos++;
			if (nbrexcept > 0) {
				int c = 0;
				for (int i = 0; i < BlockSize; ++i) {
					if ((in[tmpinpos + i] >>> bits[tmpbestb]) != 0) {
						exceptbuffer[c + nbrexcept] = i;
						exceptbuffer[c] = in[tmpinpos + i] >>> bits[tmpbestb];
						++c;
					}
				}
				exceptsize = OptP4D_S16.compress(exceptbuffer, 0, 2 * nbrexcept, out, tmpoutpos);
				tmpoutpos += exceptsize;
			}
			out[remember] = tmpbestb | (nbrexcept << 8) | (exceptsize << 16);// control
																				// word
			for (int k = 0; k < BlockSize; k += 32) {
				OptP4D_BitPacking.fastpack(in, tmpinpos + k, out, tmpoutpos, bits[tmpbestb]);
				tmpoutpos += bits[tmpbestb];
			}

			tmpinpos += 128;
		}
		tmpoutpos += OptP4D_S16.compress(in, tmpinpos, inlength - tmpinpos, out, tmpoutpos);

		inpos.set(inlength);
		outpos.set(tmpoutpos);
	}

	protected static final int[] bits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16, 20, 32 };
	protected static final int[] invbits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 14, 15, 15, 15, 15,
			16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16 };

	void getBestBFromData(int[] in, int pos, IntWrapper bestb, IntWrapper bestexcept) {
		final int mb = Util.maxbits(in, pos, BlockSize);
		int mini = 0;
		if (mini + 28 < bits[invbits[mb]])
			mini = bits[invbits[mb]] - 28; // 28 is the max for
											// exceptions
		int besti = bits.length - 1;
		int bestcost = bits[besti] * 4;
		int exceptcounter = 0;
		for (int i = mini; i < bits.length - 1; ++i) {
			int tmpcounter = 0;
			for (int k = pos; k < BlockSize + pos; ++k)
				if ((in[k] >>> bits[i]) != 0) {
					++tmpcounter;
				}
			if (tmpcounter == BlockSize)
				continue; // no need
			for (int k = pos, c = 0; k < pos + BlockSize; ++k)
				if ((in[k] >>> bits[i]) != 0) {
					exceptbuffer[tmpcounter + c] = k - pos;
					exceptbuffer[c] = in[k] >>> bits[i];
					++c;
				}

			final int thiscost = bits[i] * 4 + OptP4D_S16.estimatecompress(exceptbuffer, 0, 2 * tmpcounter);
			if (thiscost <= bestcost) {
				bestcost = thiscost;
				besti = i;
				exceptcounter = tmpcounter;
			}
		}

		bestb.set(besti);
		bestexcept.set(exceptcounter);
	}

	public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		if (inlength == 0)
			return;
		int tmpoutpos = outpos.get();
		int tmpinpos = inpos.get();
		// final int finalout = tmpoutpos + in[tmpinpos++];// (edit 1/4)
		final int finalout = outlength;
		while (tmpoutpos < finalout - 128) {
			int b = in[tmpinpos] & 0xFF;

			final int cexcept = (in[tmpinpos] >>> 8) & 0xFF;
			final int exceptsize = (in[tmpinpos++] >>> 16);
			//OptP4D_S16.uncompress(in, tmpinpos, exceptsize, exceptbuffer, 0, 2 * cexcept);
			OptP4D_S16.uncompress_my(in, tmpinpos, exceptbuffer, 0, 2 * cexcept);
			tmpinpos += exceptsize;
			for (int k = 0; k < BlockSize; k += 32) {
				OptP4D_BitPacking.fastunpack(in, tmpinpos, out, tmpoutpos + k, bits[b]);
				tmpinpos += bits[b];
			}
			for (int k = 0; k < cexcept; ++k) {
				out[tmpoutpos + exceptbuffer[k + cexcept]] |= (exceptbuffer[k] << bits[b]);
			}

			tmpoutpos += 128;
		}
		// inlength - tmpinpos> can decode
		tmpinpos += OptP4D_S16.uncompress_my(in, tmpinpos, out, tmpoutpos, finalout - tmpoutpos);

		inpos.set(tmpinpos);
		outpos.set(finalout);
	}

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
		// 输入docfre,以及有效的元素个数endOffset,解压为docids和freqs两个数组,每个有postings+1([0,
		// postings])个元素
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, docids, outpos, postings + 1);
		outpos.set(0);
		uncompress(docfre, inpos, docfre.length, freqs, outpos, postings + 1);
	}
}
