package nudt.compression.partition;


public final class OptSimple8b_F{
	// compress 2,13 with a byte, then store {1101(13) 0010(2)}

	public void uncompress(long[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		
		int currentPos = outpos.get();
		int tmpinpos =  inpos.get();
		// int outlength = in[i_inpos++]; (edit 1/4)
		// didnot store raw integer number in in[0]
		// but the index entry in lexicon store this number instead
		//final int finalout = outOffset + in[inOffset++];
		while (currentPos < outlength) {
			long val = in[tmpinpos];
			int header =(int) (val >>> 60);
			switch (header) {
			case 0:
				decode0(val, out, currentPos);
				currentPos+=240;
				break;
			case 1: 
				decode1(val, out, currentPos);
				currentPos+=120;
				break;
			case 2:
				decode2(val, out, currentPos);
				currentPos+=60;
				break;
			case 3:
				decode3(val, out, currentPos);
				currentPos+=30;
				break;
			case 4: 
				decode4(val, out, currentPos);
				currentPos+=20;
				break;
			case 5:
				decode5(val, out, currentPos);
				currentPos+=15;
				break;
			case 6: 
				decode6(val, out, currentPos);
				currentPos+=12;
				break;
			case 7: 
				decode7(val, out, currentPos);
				currentPos+=10;
				break;
			case 8:
				decode8(val, out, currentPos);
				currentPos+=8;
				break;
			case 9:
				decode9(val, out, currentPos);
				currentPos+=7;
				break;
			case 10: 
				decode10(val, out, currentPos);
				currentPos+=6;
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

	private void decode15(long val, int[] out, int currentPos) {
		// { 60 }
		out[currentPos++] = (int)((val << 4) >>> 4);
		//no use--wrong
	}

	private void decode14(long val, int[] out, int currentPos) {
		// { 30, 30 } 
		out[currentPos++] = (int)((val << 34) >>> 34);
		out[currentPos++] = (int)((val << 4) >>> 34);
	}

	private void decode13(long val, int[] out, int currentPos) {
		// { 20, 20, 20 }
		out[currentPos++] = (int)((val << 44) >>> 44);
		out[currentPos++] = (int)((val << 24) >>> 44);
		out[currentPos++] = (int)((val << 4) >>> 44);
	}

	private void decode12(long val, int[] out, int currentPos) {
		// number : 4, bitwidth : 15
		out[currentPos++] = (int)((val << 49) >>> 49);
		out[currentPos++] = (int)((val << 34) >>> 49);
		out[currentPos++] = (int)((val << 19) >>> 49);
		out[currentPos++] = (int)((val << 4) >>> 49);
	}

	private void decode11(long val, int[] out, int currentPos) {
		// number : 5, bitwidth : 12
		out[currentPos++] = (int)((val << 52) >>> 52);
		out[currentPos++] = (int)((val << 40) >>> 52);
		out[currentPos++] = (int)((val << 28) >>> 52);
		out[currentPos++] = (int)((val << 16) >>> 52);
		out[currentPos++] = (int)((val << 4) >>> 52);
	}

	private void decode10(long val, int[] out, int currentPos) {
		// number : 6, bitwidth : 10
		out[currentPos++] = (int)((val << 54) >>> 54);
		out[currentPos++] = (int)((val << 44) >>> 54);
		out[currentPos++] = (int)((val << 34) >>> 54);
		out[currentPos++] = (int)((val << 24) >>> 54);
		out[currentPos++] = (int)((val << 14) >>> 54);
		out[currentPos++] = (int)((val << 4) >>> 54);
	}

	private void decode9(long val, int[] out, int currentPos) {
		// number : 7, bitwidth : 8
		out[currentPos++] = (int)((val << 56) >>> 56);
		out[currentPos++] = (int)((val << 48) >>> 56);
		out[currentPos++] = (int)((val << 40) >>> 56);
		out[currentPos++] = (int)((val << 32) >>> 56);
		out[currentPos++] = (int)((val << 24) >>> 56);
		out[currentPos++] = (int)((val << 16) >>> 56);
		out[currentPos++] = (int)((val << 8) >>> 56);
	}

	private void decode8(long val, int[] out, int currentPos) {
		// number : 8, bitwidth : 7
		out[currentPos++] = (int)((val << 57) >>> 57);
		out[currentPos++] = (int)((val << 50) >>> 57);
		out[currentPos++] = (int)((val << 43) >>> 57);
		out[currentPos++] = (int)((val << 36) >>> 57);
		out[currentPos++] = (int)((val << 29) >>> 57);
		out[currentPos++] = (int)((val << 22) >>> 57);
		out[currentPos++] = (int)((val << 15) >>> 57);
		out[currentPos++] = (int)((val << 8) >>> 57);
	}

	private void decode7(long val, int[] out, int currentPos) {
		// number : 10, bitwidth : 6
		out[currentPos++] = (int)((val << 58) >>> 58);
		out[currentPos++] = (int)((val << 52) >>> 58);
		out[currentPos++] = (int)((val << 46) >>> 58);
		out[currentPos++] = (int)((val << 40) >>> 58);
		out[currentPos++] = (int)((val << 34) >>> 58);
		out[currentPos++] = (int)((val << 28) >>> 58);
		out[currentPos++] = (int)((val << 22) >>> 58);
		out[currentPos++] = (int)((val << 16) >>> 58);
		out[currentPos++] = (int)((val << 10) >>> 58);
		out[currentPos++] = (int)((val << 4) >>> 58);
	}

	private void decode6(long val, int[] out, int currentPos) {
		// number : 12, bitwidth : 5
		out[currentPos++] = (int)((val << 59) >>> 59);
		out[currentPos++] = (int)((val << 54) >>> 59);
		out[currentPos++] = (int)((val << 49) >>> 59);
		out[currentPos++] = (int)((val << 44) >>> 59);
		out[currentPos++] = (int)((val << 39) >>> 59);
		out[currentPos++] = (int)((val << 34) >>> 59);
		out[currentPos++] = (int)((val << 29) >>> 59);
		out[currentPos++] = (int)((val << 24) >>> 59);
		out[currentPos++] = (int)((val << 19) >>> 59);
		out[currentPos++] = (int)((val << 14) >>> 59);
		out[currentPos++] = (int)((val << 9) >>> 59);
		out[currentPos++] = (int)((val << 4) >>> 59);
	}

	private void decode5(long val, int[] out, int currentPos) {
		// number : 15, bitwidth : 4
		out[currentPos++] = (int)((val << 60) >>> 60);
		out[currentPos++] = (int)((val << 56) >>> 60);
		out[currentPos++] = (int)((val << 52) >>> 60);
		out[currentPos++] = (int)((val << 48) >>> 60);
		out[currentPos++] = (int)((val << 44) >>> 60);
		out[currentPos++] = (int)((val << 40) >>> 60);
		out[currentPos++] = (int)((val << 36) >>> 60);
		out[currentPos++] = (int)((val << 32) >>> 60);
		out[currentPos++] = (int)((val << 28) >>> 60);
		out[currentPos++] = (int)((val << 24) >>> 60);
		out[currentPos++] = (int)((val << 20) >>> 60);
		out[currentPos++] = (int)((val << 16) >>> 60);
		out[currentPos++] = (int)((val << 12) >>> 60);
		out[currentPos++] = (int)((val << 8) >>> 60);
		out[currentPos++] = (int)((val << 4) >>> 60);
	}

	private void decode4(long val, int[] out, int outOffset) {
		// number : 20, bitwidth : 3		
		out[outOffset++] = (int)((val << 61) >>> 61);
		out[outOffset++] = (int)((val << 58) >>> 61);
		out[outOffset++] = (int)((val << 55) >>> 61);
		out[outOffset++] = (int)((val << 52) >>> 61);
		out[outOffset++] = (int)((val << 49) >>> 61);
		out[outOffset++] = (int)((val << 46) >>> 61); // 10
		out[outOffset++] = (int)((val << 43) >>> 61);
		out[outOffset++] = (int)((val << 40) >>> 61);
		out[outOffset++] = (int)((val << 37) >>> 61);
		out[outOffset++] = (int)((val << 34) >>> 61);
		out[outOffset++] = (int)((val << 31) >>> 61);
		out[outOffset++] = (int)((val << 28) >>> 61);
		out[outOffset++] = (int)((val << 25) >>> 61);
		out[outOffset++] = (int)((val << 22) >>> 61);
		out[outOffset++] = (int)((val << 19) >>> 61);
		out[outOffset++] = (int)((val << 16) >>> 61); // 10
		out[outOffset++] = (int)((val << 13) >>> 61);
		out[outOffset++] = (int)((val << 10) >>> 61);
		out[outOffset++] = (int)((val << 7) >>> 61);
		out[outOffset++] = (int)((val << 4) >>> 61);
	}

	private void decode3(long val, int[] out, int currentPos) {
		// number :30, bitwidth : 2
		out[currentPos++] = (int)((val << 62) >>> 62);
		out[currentPos++] = (int)((val << 60) >>> 62);
		out[currentPos++] = (int)((val << 58) >>> 62);
		out[currentPos++] = (int)((val << 56) >>> 62);
		out[currentPos++] = (int)((val << 54) >>> 62);
		out[currentPos++] = (int)((val << 52) >>> 62);
		out[currentPos++] = (int)((val << 50) >>> 62);
		out[currentPos++] = (int)((val << 48) >>> 62);
		out[currentPos++] = (int)((val << 46) >>> 62);
		out[currentPos++] = (int)((val << 44) >>> 62);
		out[currentPos++] = (int)((val << 42) >>> 62);
		out[currentPos++] = (int)((val << 40) >>> 62);
		out[currentPos++] = (int)((val << 38) >>> 62);
		out[currentPos++] = (int)((val << 36) >>> 62);
		out[currentPos++] = (int)((val << 34) >>> 62);
		out[currentPos++] = (int)((val << 32) >>> 62);
		out[currentPos++] = (int)((val << 30) >>> 62);
		out[currentPos++] = (int)((val << 28) >>> 62);
		out[currentPos++] = (int)((val << 26) >>> 62);
		out[currentPos++] = (int)((val << 24) >>> 62);
		out[currentPos++] = (int)((val << 22) >>> 62);
		out[currentPos++] = (int)((val << 20) >>> 62);
		out[currentPos++] = (int)((val << 18) >>> 62);
		out[currentPos++] = (int)((val << 16) >>> 62);
		out[currentPos++] = (int)((val << 14) >>> 62);
		out[currentPos++] = (int)((val << 12) >>> 62);
		out[currentPos++] = (int)((val << 10) >>> 62);
		out[currentPos++] = (int)((val << 8) >>> 62);
		out[currentPos++] = (int)((val << 6) >>> 62);
		out[currentPos++] = (int)((val << 4) >>> 62);
	}

	private void decode2(long val, int[] out, int currentPos) {
		// number : 60, bitwidth : 1
		out[currentPos++] = (int)((val << 63) >>> 63);
		out[currentPos++] = (int)((val << 62) >>> 63);
		out[currentPos++] = (int)((val << 61) >>> 63);
		out[currentPos++] = (int)((val << 60) >>> 63);
		out[currentPos++] = (int)((val << 59) >>> 63);
		out[currentPos++] = (int)((val << 58) >>> 63);
		out[currentPos++] = (int)((val << 57) >>> 63);
		out[currentPos++] = (int)((val << 56) >>> 63);
		out[currentPos++] = (int)((val << 55) >>> 63);
		out[currentPos++] = (int)((val << 54) >>> 63);
		out[currentPos++] = (int)((val << 53) >>> 63);
		out[currentPos++] = (int)((val << 52) >>> 63);
		out[currentPos++] = (int)((val << 51) >>> 63);
		out[currentPos++] = (int)((val << 50) >>> 63);
		out[currentPos++] = (int)((val << 49) >>> 63);
		out[currentPos++] = (int)((val << 48) >>> 63);
		out[currentPos++] = (int)((val << 47) >>> 63);
		out[currentPos++] = (int)((val << 46) >>> 63);
		out[currentPos++] = (int)((val << 45) >>> 63);
		out[currentPos++] = (int)((val << 44) >>> 63);
		out[currentPos++] = (int)((val << 43) >>> 63);
		out[currentPos++] = (int)((val << 42) >>> 63);
		out[currentPos++] = (int)((val << 41) >>> 63);
		out[currentPos++] = (int)((val << 40) >>> 63);
		out[currentPos++] = (int)((val << 39) >>> 63);
		out[currentPos++] = (int)((val << 38) >>> 63);
		out[currentPos++] = (int)((val << 37) >>> 63);
		out[currentPos++] = (int)((val << 36) >>> 63);
		out[currentPos++] = (int)((val << 35) >>> 63);
		out[currentPos++] = (int)((val << 34) >>> 63);
		out[currentPos++] = (int)((val << 33) >>> 63);
		out[currentPos++] = (int)((val << 32) >>> 63);
		out[currentPos++] = (int)((val << 31) >>> 63);
		out[currentPos++] = (int)((val << 30) >>> 63);
		out[currentPos++] = (int)((val << 29) >>> 63);
		out[currentPos++] = (int)((val << 28) >>> 63);
		out[currentPos++] = (int)((val << 27) >>> 63);
		out[currentPos++] = (int)((val << 26) >>> 63);
		out[currentPos++] = (int)((val << 25) >>> 63);
		out[currentPos++] = (int)((val << 24) >>> 63);
		out[currentPos++] = (int)((val << 23) >>> 63);
		out[currentPos++] = (int)((val << 22) >>> 63);
		out[currentPos++] = (int)((val << 21) >>> 63);
		out[currentPos++] = (int)((val << 20) >>> 63);
		out[currentPos++] = (int)((val << 19) >>> 63);
		out[currentPos++] = (int)((val << 18) >>> 63);
		out[currentPos++] = (int)((val << 17) >>> 63);
		out[currentPos++] = (int)((val << 16) >>> 63);
		out[currentPos++] = (int)((val << 15) >>> 63);
		out[currentPos++] = (int)((val << 14) >>> 63);
		out[currentPos++] = (int)((val << 13) >>> 63);
		out[currentPos++] = (int)((val << 12) >>> 63);
		out[currentPos++] = (int)((val << 11) >>> 63);
		out[currentPos++] = (int)((val << 10) >>> 63);
		out[currentPos++] = (int)((val << 9) >>> 63);
		out[currentPos++] = (int)((val << 8) >>> 63);
		out[currentPos++] = (int)((val << 7) >>> 63);
		out[currentPos++] = (int)((val << 6) >>> 63);
		out[currentPos++] = (int)((val << 5) >>> 63);
		out[currentPos++] = (int)((val << 4) >>> 63);
	}

	private void decode1(long val, int[] out, int outOffset) {
		// number : 120, bitwidth :0
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
	}

	private void decode0(long val, int[] out, int outOffset) {
		// TODO Auto-generated method stub
		// number : 240, bitwidth : 0
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 10
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0; // 20
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
		out[outOffset++] = 0;
	}
	
	public void compress(int[] in, IntWrapper inpos, int inlength, long[] out, IntWrapper outpos) {
		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list
		// out[i_outpos++] = inlength;//no-use for simple index compression
		// (edit 2/4)
		
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
	
	// (edit 3/4)
	public void encode(int[] diffarray, long[] docidout, int[] dcountw) {
		IntWrapper inpos = new IntWrapper();
		IntWrapper outpos = new IntWrapper();
		inpos.set(0);
		outpos.set(0);
		compress(diffarray, inpos, diffarray.length, docidout, outpos);
		dcountw[0] = outpos.get();
	}

	// (edit 4/4)
	public void decode(long[] docfre, int[] docids, int[] freqs, int postings) {
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