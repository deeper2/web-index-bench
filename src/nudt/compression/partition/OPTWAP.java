package nudt.compression.partition;


import java.io.IOException;
import java.util.Random;


public final class OPTWAP {
	public void uncompress(long[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int outlength) {
		
		int currentPos = outpos.get();
		int datainpos =  inpos.get();
		
		//final int finalout = currentPos + (int)in[datainpos++];(edit 1/4)
		final int finalout = currentPos + outlength;
		int wordnum=(int)in[datainpos++];
		int[] numIdxs = new int[wordnum+15];
		int kbareapos = wordnum + datainpos;

		for (int i = 0; i < wordnum; i += 16) {
			numIdxs[i] = (int) (in[kbareapos]) & 0x0000000F;
			numIdxs[i+1] = (int) (in[kbareapos] >> 4) & 0x0000000F;
			numIdxs[i + 2] = (int) (in[kbareapos] >> 8) & 0x0000000F;
			numIdxs[i + 3] = (int) (in[kbareapos] >> 12) & 0x0000000F;
			numIdxs[i + 4] = (int) (in[kbareapos] >> 16) & 0x0000000F;
			numIdxs[i + 5] = (int) (in[kbareapos] >> 20) & 0x0000000F;
			numIdxs[i + 6] = (int) (in[kbareapos] >> 24) & 0x0000000F;
			numIdxs[i + 7] = (int) (in[kbareapos] >> 28) & 0x0000000F;
			numIdxs[i + 8] = (int) (in[kbareapos] >> 32) & 0x0000000F;
			numIdxs[i + 9] = (int) (in[kbareapos] >> 36) & 0x0000000F;
			numIdxs[i + 10] = (int) (in[kbareapos] >> 40) & 0x0000000F;
			numIdxs[i + 11] = (int) (in[kbareapos] >> 44) & 0x0000000F;
			numIdxs[i + 12] = (int) (in[kbareapos] >> 48) & 0x0000000F;
			numIdxs[i + 13] = (int) (in[kbareapos] >> 52) & 0x0000000F;
			numIdxs[i + 14] = (int) (in[kbareapos] >> 56) & 0x0000000F;
			numIdxs[i + 15] = (int) (in[kbareapos] >> 60) & 0x0000000F;
			kbareapos++;
		}

		
		int i = 0;	
		//int counter=0;
		while (currentPos < finalout) {
		//while (counter++ < wordnum) {
			long val = in[datainpos++];
			int header =numIdxs[i++];
			//hist[header]++;	
			switch (header) {
			case 0:
				decode0(val, out, currentPos);
				currentPos+=64;
				break;
			case 1: 
				decode1(val, out, currentPos);
				currentPos+=48;
				break;
			case 2:
				decode2(val, out, currentPos);
				currentPos+=48;
				break;
			case 3:
				decode3(val, out, currentPos);
				currentPos+=32;
				break;
			case 4: 
				decode4(val, out, currentPos);
				currentPos+=21;
				break;
			case 5:
				decode5(val, out, currentPos);
				currentPos+=16;
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
				currentPos+=9;
				break;
			case 9:
				decode9(val, out, currentPos);
				currentPos+=8;
				break;
			case 10: 
				decode10(val, out, currentPos);
				currentPos+=7;
				break;
			case 11: 
				decode11(val, out, currentPos);
				currentPos+=6;
				break;
			case 12:
				decode12(val, out, currentPos);
				currentPos+=5;
				break;
			case 13: 
				decode13(val, out, currentPos);
				currentPos+=4;
				break;
			case 14: 
				decode14(val, out, currentPos);
				currentPos+=3;
				break;
			case 15: 
				decode15(val, out, currentPos);
				currentPos+=1;
				break;
			}
		}
		outpos.set(finalout);
		inpos.set(kbareapos);
	}

/*	private void decode15(long val, int[] out, int currentPos) {
		// { 32, 32 } 
		out[currentPos++] = (int)((val << 32) >>> 32);
		out[currentPos++] = (int)((val << 0) >>> 32);
	}*/
	
	private void decode15(long val, int[] out, int currentPos) {
		// { 64 }
		out[currentPos++] = (int)val;
		//throw new RuntimeException("Too big a number");	
		//no use--wrong
	}

	private void decode14(long val, int[] out, int currentPos) {
		// number : 3, bitwidth : 21
		out[currentPos++] = (int)((val << 43) >>> 43);//21
		out[currentPos++] = (int)((val << 22) >>> 43);//21
		out[currentPos++] = (int)((val << 0) >>> 42);//22
	}

	private void decode13(long val, int[] out, int currentPos) {
		// number : 4, bitwidth : 16
		out[currentPos++] = (int)((val << 48) >>> 48);
		out[currentPos++] = (int)((val << 32) >>> 48);
		out[currentPos++] = (int)((val << 16) >>> 48);
		out[currentPos++] = (int)((val << 0) >>> 48);
	}

	private void decode12(long val, int[] out, int currentPos) {
		// number : 5, bitwidth : 12
		out[currentPos++] = (int)((val << 52) >>> 52);
		out[currentPos++] = (int)((val << 39) >>> 51);//13bits
		out[currentPos++] = (int)((val << 26) >>> 51);//13bits
		out[currentPos++] = (int)((val << 13) >>> 51);//13bits
		out[currentPos++] = (int)((val << 0) >>> 51);//13bits
	}

	private void decode11(long val, int[] out, int currentPos) {
		// number : 6, bitwidth : 10
		out[currentPos++] = (int)((val << 54) >>> 54);
		out[currentPos++] = (int)((val << 44) >>> 54);
		out[currentPos++] = (int)((val << 33) >>> 53);//11bits
		out[currentPos++] = (int)((val << 22) >>> 53);//11bits
		out[currentPos++] = (int)((val << 11) >>> 53);//11bits
		out[currentPos++] = (int)((val << 0) >>> 53);//11bits
	}

	private void decode10(long val, int[] out, int currentPos) {
		// number : 7, bitwidth : 9
		out[currentPos++] = (int)((val << 55) >>> 55);
		out[currentPos++] = (int)((val << 46) >>> 55);
		out[currentPos++] = (int)((val << 37) >>> 55);
		out[currentPos++] = (int)((val << 28) >>> 55);
		out[currentPos++] = (int)((val << 19) >>> 55);
		out[currentPos++] = (int)((val << 10) >>> 55);
		out[currentPos++] = (int)((val << 0) >>> 54);
	}

	private void decode9(long val, int[] out, int currentPos) {
		// number : 8, bitwidth : 8
		out[currentPos++] = (int)((val << 56) >>> 56);
		out[currentPos++] = (int)((val << 48) >>> 56);
		out[currentPos++] = (int)((val << 40) >>> 56);
		out[currentPos++] = (int)((val << 32) >>> 56);
		out[currentPos++] = (int)((val << 24) >>> 56);
		out[currentPos++] = (int)((val << 16) >>> 56);
		out[currentPos++] = (int)((val << 8) >>> 56);
		out[currentPos++] = (int)((val) >>> 56);
	}

	private void decode8(long val, int[] out, int currentPos) {
		// number : 9, bitwidth : 7bits
		out[currentPos++] = (int)((val << 57) >>> 57);
		out[currentPos++] = (int)((val << 50) >>> 57);
		out[currentPos++] = (int)((val << 43) >>> 57);
		out[currentPos++] = (int)((val << 36) >>> 57);
		out[currentPos++] = (int)((val << 29) >>> 57);
		out[currentPos++] = (int)((val << 22) >>> 57);
		out[currentPos++] = (int)((val << 15) >>> 57);
		out[currentPos++] = (int)((val << 8) >>> 57);
		out[currentPos++] = (int)((val << 0) >>> 56);
	}
	
	private void decode7(long val, int[] out, int currentPos) {
		// number : 10, bitwidth : 6bits
		out[currentPos++] = (int)((val << 58) >>> 58);
		out[currentPos++] = (int)((val << 52) >>> 58);
		out[currentPos++] = (int)((val << 46) >>> 58);
		out[currentPos++] = (int)((val << 40) >>> 58);
		out[currentPos++] = (int)((val << 34) >>> 58);
		out[currentPos++] = (int)((val << 28) >>> 58);
		out[currentPos++] = (int)((val << 21) >>> 57);//7bits
		out[currentPos++] = (int)((val << 14) >>> 57);//7bits
		out[currentPos++] = (int)((val << 7) >>> 57);//7bits
		out[currentPos++] = (int)((val << 0) >>> 57);//7bits
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
		out[currentPos++] = (int)((val << 18) >>> 58);//6bits
		out[currentPos++] = (int)((val << 12) >>> 58);//6bits
		out[currentPos++] = (int)((val << 6) >>> 58);//6bits
		out[currentPos++] = (int)((val << 0) >>> 58);//6bits
	}

	private void decode5(long val, int[] out, int currentPos) {
		// number : 16, bitwidth : 4
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
		out[currentPos++] = (int)((val << 0) >>> 60);
	}

	private void decode4(long val, int[] out, int outOffset) {
		// number : 21, bitwidth : 3		
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
		//out[outOffset++] = (int)((val << 1) >>> 61);
		out[outOffset++] = (int)((val << 0) >>> 60);//4bits
	}

	private void decode3(long val, int[] out, int currentPos) {
		// number :32, bitwidth : 2
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
		out[currentPos++] = (int)((val << 2) >>> 62);
		out[currentPos++] = (int)((val << 0) >>> 62);
	}
	
	private void decode1(long val, int[] out, int currentPos) {
		// number :32, bitwidth : 2
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
		out[currentPos++] = (int)((val << 2) >>> 62);
		out[currentPos++] = (int)((val << 0) >>> 62);
	}
	
	private void decode2(long val, int[] out, int currentPos) {
		// number :32, bitwidth : 2
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
		out[currentPos++] = (int)((val << 3) >>> 63);
		out[currentPos++] = (int)((val << 2) >>> 63);
		out[currentPos++] = (int)((val << 1) >>> 63);
		out[currentPos++] = (int)((val << 0) >>> 63);
	}

	private void decode0(long val, int[] out, int currentPos) {
		// number : 64, bitwidth : 1
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
		out[currentPos++] = (int)((val << 3) >>> 63);
		out[currentPos++] = (int)((val << 2) >>> 63);
		out[currentPos++] = (int)((val << 1) >>> 63);
		out[currentPos++] = (int)((val << 0) >>> 63);
	}
	
	public void compress(int[] in, IntWrapper inpos, int inlength, long[] out, IntWrapper outpos) {

		int tmpoutpos = outpos.get();
		int currentPos = inpos.get();
		//out[tmpoutpos++] = inlength;// store the total number of given list
		// (edit 2/4)
		
		/*dynamic programming*/
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
			mainloop: for (int selector = 0; selector < WAP_NUMSIZE; selector++) {
				// check every padding mode backward
				int compressedNum = WAP_NUM[selector];
				if ((index - compressedNum) < 0) {
					continue mainloop;// break;
				}

				for (int i = 0; i < compressedNum; i++) {
					if (SHIFTED_WAP_BITS[selector][compressedNum - i - 1] <= in[index - i - 1])
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
		}/*end dynamic programming*/

		// coding with the optimal splitting from right to left
		currentPos = in.length;// right side
		int startpos = tmpoutpos++;
		tmpoutpos += mincodeword[in.length] - 1;// last codeword index
		inpos.set(currentPos);
		int[] numIdxs= new int[inlength]; //stores the kbindex together
		int wordnum = 0;
		while (currentPos > 0) {
			int selector = lastselector[currentPos];
			long res = 0;
			int compressedNum = WAP_NUM[selector];
			
			for (int i = 0; i < compressedNum; i++) {
				res = (res << WAP_BITS[selector][compressedNum - i - 1]) | in[currentPos - i - 1];
			}//compress 2,13 with a byte, then store {0010(2) 1101(13)  }
			numIdxs[wordnum++] = selector ;//store all numIdxs-selector together

			out[tmpoutpos--] = res;//store codeword from right to left too
			currentPos -= compressedNum;
		}
		tmpoutpos+= mincodeword[in.length] + 1;//reset tmpoutpos
		
		out[startpos] = wordnum;//codewords number
		//copy the kbindex to out arrays from right to left
		int i;
		for (i = wordnum-1; i >= 0; i--) {
			//out[tmpoutpos] = (out[tmpoutpos] << 4) | (numIdxs[i] & 0x0000000F);
			out[tmpoutpos] = out[tmpoutpos] | ((long)numIdxs[i] << (4 * (wordnum-1-i)));
			if ((wordnum - 1 - i) % 16 == 15)
				tmpoutpos++;
		}
		if ((wordnum - 1 - i) % 16 != 0)
			tmpoutpos++;
		
		outpos.set(tmpoutpos);
	}

	private static long[][] shiftme(int[][] x) {
		long[][] answer = new long[x.length][];
		for (int k = 0; k < x.length; ++k) {
			answer[k] = new long[x[k].length];
			for (int z = 0; z < answer[k].length; ++z)
				answer[k][z] = (long)1 << x[k][z];
		}
		return answer;
	}

	private static final int WAP_NUMSIZE = 16;

	// the possible number of bits used to represent one integer
	private static final int[] WAP_NUM = { 64, 48, 48, 32, 21, 16, 12, 10, 9, 8, 7, 6, 5, 4, 3, 1};
	// the corresponding number of elements for each value of the number of bits

	private static final int[][] WAP_BITS = {
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				  2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 ,
			  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4 },
			{ 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 },
			{ 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6 },
			{ 6, 6, 6, 6, 6, 6, 7, 7, 7, 7 },
			{ 7, 7, 7, 7, 7, 7, 7, 7, 8 },
			{ 8, 8, 8, 8, 8, 8, 8, 8 },
			{ 9, 9, 9, 9, 9, 9, 10},
			{ 10, 10, 11, 11, 11, 11 },
			{ 12, 13, 13, 13, 13 },
			{ 16, 16, 16, 16 },
			{ 21, 21, 22 },
			{ 32 }};
	
	private static final long[][] SHIFTED_WAP_BITS = shiftme(WAP_BITS);
	
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