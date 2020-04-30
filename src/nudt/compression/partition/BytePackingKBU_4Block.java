package nudt.compression.partition;


/**
 * BytePacking routines for VSE-Block
 * 
 * @author Kun Jiang
 * 
 */
public final class BytePackingKBU_4Block {
	
	/**
	 * unPack integers
	 * 
	 * @param in
	 *            compressed source array
	 * @param inpos
	 *            starting point in the source array
	 * @param out
	 *            output array
	 * @param maxB
	 *            b: bit width
	 * @param bs
	 *            K: uncoded numbers of a permuted block
	 */
	public static void fastunpack(final byte[] in, IntWrapper inpos, final int[] out, int maxB, final int bs) {
		switch (maxB) {
		case 1:
			fastunpack1(in, inpos, out, bs);
			break;
		case 2:
			fastunpack2(in, inpos, out, bs);
			break;
		case 3:
			fastunpack3(in, inpos, out, bs);
			break;
		case 4:
			fastunpack4(in, inpos, out, bs);
			break;
		case 5:
			fastunpack5(in, inpos, out, bs);
			break;
		case 6:
			fastunpack6(in, inpos, out, bs);
			break;
		case 7:
			fastunpack7(in, inpos, out, bs);
			break;
		case 8:
			fastunpack8(in, inpos, out, bs);
			break;
		case 9:
			fastunpack9(in, inpos, out, bs);
			break;
		case 10:
			fastunpack10(in, inpos, out, bs);
			break;
		case 11:
			fastunpack11(in, inpos, out, bs);
			break;
		case 12:
			fastunpack12(in, inpos, out, bs);
			break;
		case 13:
			fastunpack16(in, inpos, out, bs);
			break;
		case 14:
			fastunpack20(in, inpos, out, bs);
			break;
		case 15:
			fastunpack32(in, inpos, out, bs);
			break;
		default:
			throw new IllegalArgumentException("Unsupported bit width.");
		}
	}
 
    /**
     * 4 golden rules：
     * 首次右移（8-位宽）,末次右移0,
     * |位左移bits+所有本行和之前的注释bits=位宽（非最后一行）
     * |位右移bits+注释bits=8bits（最后一行）
     * 注意：java没有无符号整数，>>右移操作要防止符号位，要用&0xffff方式取出所需比特
     */

	//1 bytes
    protected static void fastunpack1(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8,inOffset+=1) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 7) & 0x01);
            out[1 + i] = ((var >> 6) & 0x01);
            out[2 + i] = ((var >> 5) & 0x01);
            out[3 + i] = ((var >> 4) & 0x01);
            out[4 + i] = ((var >> 3) & 0x01);
            out[5 + i] = ((var >> 2) & 0x01);
            out[6 + i] = ((var >> 1) & 0x01);
            out[7 + i] = ((var >> 0) & 0x01);              
    	}
		inpos.add((1 * bs + 7) / 8);
    }

    //1 bytes
    protected static void fastunpack2(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 4, inOffset+=1) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 6) & 0x03);
            out[1 + i] = ((var >> 4) & 0x03);
            out[2 + i] = ((var >> 2) & 0x03);
            out[3 + i] = ((var >> 0) & 0x03);
		}
		inpos.add((2 * bs + 7) / 8);
    }

    //3*8=3bytes
    protected static void fastunpack3(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8, inOffset+=3) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 5) & 0x07);
            out[1 + i] = ((var >> 2) & 0x07);
            out[2 + i] = ((var << 1) & 0x07);//2bits
            
            var= in[1 + inOffset];
            out[2 + i] |= ((var >> 7) & 0x01);//1bit
            out[3 + i] = ((var >> 4) & 0x07);
            out[4 + i] = ((var >> 1) & 0x07);
            out[5 + i] = ((var << 2) & 0x07);//1bit
            
            var= in[2 + inOffset];
            out[5 + i] |= ((var >> 6) & 0x03);//2bits
            out[6 + i] = ((var >> 3) & 0x07);
            out[7 + i] = ((var >> 0) & 0x07);
		}
		inpos.add((3 * bs + 7) / 8);
    }

    //4*2=1byte
    protected static void fastunpack4(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 2, inOffset+=1) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 4) & 0x0f);
            out[1 + i] = ((var >> 0) & 0x0f);
		}
		inpos.add((4 * bs + 7) / 8);
    }

    //5*8=5bytes
    protected static void fastunpack5(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8, inOffset+=5) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 3) & 0x1f);
            out[1 + i] = ((var << 2) & 0x1f);//3bits
            
            var= in[1 + inOffset];
            out[1 + i] |= ((var >> 6) & 0x03);//2bits
            out[2 + i] = ((var >> 1) & 0x1f);
            out[3 + i] = ((var << 4) & 0x1f);//1bits
            
            var= in[2 + inOffset];
            out[3 + i] |= ((var >> 4) & 0x0f);//4bits
            out[4 + i] = ((var << 1) & 0x1f);//4bits
            
            var= in[3 + inOffset];
            out[4 + i] |= ((var >> 7) & 0x01);//1bits
            out[5 + i] = ((var >> 2) & 0x1f);
            out[6 + i] = ((var << 3) & 0x1f);//2bits
            
            var= in[4 + inOffset];
            out[6 + i] |= ((var >> 5) & 0x07);//3bits
            out[7 + i] = ((var >> 0) & 0x1f);
		}
		inpos.add((5 * bs + 7) / 8);
    }

    //6*4=3bytes
    protected static void fastunpack6(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 4, inOffset+=3) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 2) & 0x3f);
            out[1 + i] = ((var << 4) & 0x3f);//2bits
            
            var= in[1 + inOffset];
            out[1 + i] |= ((var >> 4) & 0x0f);//4bits
            out[2 + i] = ((var << 2) & 0x3f);//4bits
            
            var= in[2 + inOffset];
            out[2 + i] |= ((var >> 6) & 0x03);//2bits
            out[3 + i] = ((var >> 0) & 0x3f);
		}
		inpos.add((6 * bs + 7) / 8);
    }

    //7*8=7bytes
    protected static void fastunpack7(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8, inOffset+=7) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var >> 1) & 0x7f);//7bits
            out[1 + i] = ((var << 6) & 0x7f);//1bits
            
            var= in[1 + inOffset];
            out[1 + i] |= ((var >> 2) & 0x3f);//6bits
            out[2 + i] = ((var << 5) & 0x7f);//2bits
            
            var= in[2 + inOffset];
            out[2 + i] |= ((var >> 3) & 0x1f);//5bits
            out[3 + i] = ((var << 4) & 0x7f);//3bits
            
            var= in[3 + inOffset];
            out[3 + i] |= ((var >> 4) & 0x0f);//4bits
            out[4 + i] = ((var << 3) & 0x7f);//4bits
            
            var= in[4 + inOffset];
            out[4 + i] |= ((var >> 5) & 0x07);//3bits
            out[5 + i] = ((var << 2) & 0x7f);//5bits
            
            var= in[5 + inOffset];
            out[5 + i] |= ((var >> 6) & 0x03);//2bits
            out[6 + i] = ((var << 1) & 0x7f);//6bits
            
            var= in[6 + inOffset];
            out[6 + i] |= ((var >> 7) & 0x01);//1bits
            out[7 + i] = ((var << 0) & 0x7f);//7bits
		}
		inpos.add((7 * bs + 7) / 8);
    }
	
    //8*1=1byte
    protected static void fastunpack8(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 1, inOffset+=1) {//i indicate out array
            out[0 + i] = ((in[0 + inOffset] >> 0) & 0xff);
		}
		inpos.add((8 * bs + 7) / 8);
    }

    //9*8=9bytes
    protected static void fastunpack9(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8, inOffset+=9) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var << 1) & 0x01ff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var >> 7) & 0x01);//1bits
            out[1 + i] = ((var << 2) & 0x01ff);//7bits
            
            var= in[2 + inOffset];
            out[1 + i] |= ((var >> 6) & 0x03);//2bits
            out[2 + i] = ((var << 3) & 0x01ff);//6bits
            
            var= in[3 + inOffset];
            out[2 + i] |= ((var >> 5) & 0x07);//3bits
            out[3 + i] = ((var << 4) & 0x01ff);//5bits
            
            var= in[4 + inOffset];
            out[3 + i] |= ((var >> 4) & 0x0f);//4bits
            out[4 + i] = ((var << 5) & 0x01ff);//4bits
            
            var= in[5 + inOffset];
            out[4 + i] |= ((var >> 3) & 0x001f);//5bits
            out[5 + i] = ((var << 6) & 0x01ff);//3bits
            
            var= in[6 + inOffset];
            out[5 + i] |= ((var >> 2) & 0x003f);//6bits
            out[6 + i] = ((var << 7) & 0x01ff);//2bits
            
            var= in[7 + inOffset];
            out[6 + i] |= ((var >> 1) & 0x007f);//7bits
            out[7 + i] = ((var << 8) & 0x01ff);//1bits
            
            var= in[8 + inOffset];
            out[7 + i] |= ((var >> 0) & 0x00ff);//8bits
		}
		inpos.add((9 * bs + 7) / 8);
    }

    //10*4=5bytes
    protected static void fastunpack10(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 4, inOffset+=5) {//i indicate out array
			int var= in[0 + inOffset];//signed int
            out[0 + i] = ((var << 2) & 0x03ff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var >> 6) & 0x0003);//2bits
            out[1 + i] = ((var << 4) & 0x03ff);//6bits
            
            var= in[2 + inOffset];
            out[1 + i] |= ((var >> 4) & 0x000f);//4bits
            out[2 + i] = ((var << 6) & 0x03ff);//4bits
            
            var= in[3 + inOffset];
            out[2 + i] |= ((var >> 2) & 0x003f);//6bits
            out[3 + i] = ((var << 8) & 0x03ff);//2bits
            
            var= in[4 + inOffset];
            out[3 + i] |= ((var >> 0) & 0x00ff);//8bits
		}
		inpos.add((10 * bs + 7) / 8);
    }
     
    //11*8=11bytes
    protected static void fastunpack11(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 8, inOffset+=11) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var << 3) & 0x07ff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var >> 5) & 0x07);//3bits
            out[1 + i] = ((var << 6) & 0x07ff);//5bits
            
            var= in[2 + inOffset];
            out[1 + i] |= ((var >> 2) & 0x003f);//6bits
            out[2 + i] = ((var << 9) & 0x07ff);//2bits
            
            var= in[3 + inOffset];
            out[2 + i] |= ((var << 1) & 0x01ff);//8bits
            
            var= in[4 + inOffset];
            out[2 + i] |= ((var >> 7) & 0x01);//1bits
            out[3 + i] = ((var << 4) & 0x07ff);//7bits
            
            var= in[5 + inOffset];
            out[3 + i] |= ((var >> 4) & 0x0f);//4bits
            out[4 + i] = ((var << 7) & 0x07ff);//4bits
            
            var= in[6 + inOffset];
            out[4 + i] |= ((var >> 1) & 0x7f);//7bits
            out[5 + i] = ((var << 10) & 0x07ff);//1bits
            
            var= in[7 + inOffset];
            out[5 + i] |= ((var << 2) & 0x03ff);//8bits
            
            var= in[8 + inOffset];
            out[5 + i] |= ((var >> 6) & 0x03);//2bits
            out[6 + i] = ((var << 5) & 0x07ff);//6bits
            
            var= in[9 + inOffset];
            out[6 + i] |= ((var >> 3) & 0x1f);//5bits
            out[7 + i] = ((var << 8) & 0x07ff);//3bits
            
            var= in[10 + inOffset];
            out[7 + i] |= ((var >> 0) & 0xff);//8bits
		}
		inpos.add((11 * bs + 7) / 8);
    }

    //12*2=3bytes
    protected static void fastunpack12(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 2, inOffset+=3) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var << 4) & 0x0fff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var >> 4) & 0x0f);//4bits
            out[1 + i] = ((var << 8) & 0x0fff);//4bits
            
            var= in[2 + inOffset];
            out[1 + i] |= ((var >> 0) & 0xff);//8bits 
		}
		inpos.add((12 * bs + 7) / 8);
    }

    //16*1=2bytes
    protected static void fastunpack16(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 1, inOffset+=2) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var << 8) & 0xffff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var >> 0) & 0xff);//8bits   
		}
		inpos.add((16 * bs + 7) / 8);
    }
    
    //20*2=5bytes
    protected static void fastunpack20(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
    	int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 2, inOffset+=5) {//i indicate out array
			int var= in[0 + inOffset];
            out[0 + i] = ((var << 12) & 0x0fffff);//8bits
            
            var= in[1 + inOffset];
            out[0 + i] |= ((var << 4) & 0x0fff);//8bits
            
            var= in[2 + inOffset];
            out[0 + i] |= ((var >> 4) & 0x0f);//4bits
            out[1 + i] = ((var << 16) & 0x0fffff);//4bits
            
            var= in[3 + inOffset];
            out[1 + i] |= ((var << 8) & 0xffff);//8bits
            
            var= in[4 + inOffset];
            out[1 + i] |= ((var >> 0) & 0xff);//8bits
		}
		inpos.add((20 * bs + 7) / 8);
    }

    //32*1=4bytes
    protected static void fastunpack32(final byte[] in, IntWrapper inpos,
            final int[] out, int bs) {
		int inOffset = inpos.get();//inOffset indicate in array
		for (int i = 0; i < bs; i += 1, inOffset+=4) {//i indicate out array
			int var= in[0 + inOffset];
			out[0 + i] = ((var << 24) & 0xffffffff);//8bits
			
			var= in[1 + inOffset];
			out[0 + i] |= ((var << 16) & 0xffffff);//8bits
			
			var= in[2 + inOffset];
			out[0 + i] |= ((var << 8) & 0xffff);//8bits
			
			var= in[3 + inOffset];
			out[0 + i] |= ((var >> 0) & 0xff);//8bits
		}
		inpos.add((32 * bs + 7) / 8);
    }
    
}
