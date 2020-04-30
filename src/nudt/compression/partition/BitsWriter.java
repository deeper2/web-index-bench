package nudt.compression.partition;


/**
 * 
 * The numbers are written into a byte starting from the most significant bit (i.e, left to right).
 * There is an internal int buffer used before writting the bytes to the underlying stream,
 * and the bytes are written into 32-bits integers.
 * 
 * @author Kun Jiang
 *
 */
public class BitsWriter{
	/** Writing buffer */
	protected byte[] buffer;
	/** pointer for the buffer */
	protected int bufferPointer;
	/** The bit offset.*/
	protected int bitOffset;
	/** A int to write to the stream. */
	protected int bytesToWrite;//32-bit(four bytes flush), can be changed to 8-bit(one byte flush)
	
	IntWrapper outpostmp;

	public BitsWriter(byte[] out, IntWrapper outpos){		
		buffer = out;//array object calling by reference
		outpostmp=outpos;
		bufferPointer = outpos.get();
		bitOffset = 32;// bits unpadded	
		bytesToWrite = 0;
	}
	
	/**
	 * Writes a number in the current byte we are using.
	 * @param b the number to write
	 * @param len the length of the number in bits
	 * @return the number of bits written
	 * @throws IOException if an I/O error occurs.
	 */
	private int write_auto_bits( final int b, final int len ){	
		// This check is necessaty because x << 32 = x and not 0 
		if(len > 0){ 
			bytesToWrite |= b <<  (bitOffset-=len);//store b from left to right of a byte
			if ( bitOffset == 0 ) {
				try{
				buffer[bufferPointer++] = (byte)(bytesToWrite >>> 24);
				buffer[bufferPointer++] = (byte)(bytesToWrite >>> 16);
				buffer[bufferPointer++] = (byte)(bytesToWrite >>> 8);
				buffer[bufferPointer++] = (byte)bytesToWrite;
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println();
				}
				outpostmp.add(4);
				bitOffset = 32;
				bytesToWrite = 0;			
			}
		}
		return len;
	}

	/**
	 * Writes an integer x into the underlying OutputStream. First, it checks if it fits into the current
	 * byte we are using for writting, and then it writes as many bytes as necessary
	 * @param x the int to write
	 * @param len length of the int in bits
	 * @return the number of bits written
	 * @throws IOException if an I/O error occurs.
	 */
	public int write_bits( int x, final int len ){	
		if ( bitOffset >= len  )
			return write_auto_bits( x, len );

		// number of bits to be written in the last int
		final int queue = ( len - bitOffset ) & 31; 
	
		write_auto_bits( x >> queue, bitOffset );
		write_auto_bits( x , queue);
		return len;
	}

	/**
	 * Pads the current byte and writes the current int into the buffer.
	 * Then, it flushes the buffer to the underlying byte array.
	 * byte-aligned
	 */
	public void flush_bits(){
		if (bitOffset < 32){
			buffer[bufferPointer++] = (byte) (bytesToWrite >>> 24);
			outpostmp.increment();
		}
		if (bitOffset < 24){
			buffer[bufferPointer++] = (byte) (bytesToWrite >>> 16);
			outpostmp.increment();
		}
		if (bitOffset < 16){
			buffer[bufferPointer++] = (byte) (bytesToWrite >>> 8);
			outpostmp.increment();
		}
		if (bitOffset < 8){
			buffer[bufferPointer++] = (byte) (bytesToWrite);
			outpostmp.increment();
		}
		bytesToWrite = 0;
		bitOffset = 32;
	}
	
	public void flush_32bits(){
		buffer[bufferPointer++] = (byte)(bytesToWrite >>> 24);
		buffer[bufferPointer++] = (byte)(bytesToWrite >>> 16);
		buffer[bufferPointer++] = (byte)(bytesToWrite >>> 8);
		buffer[bufferPointer++] = (byte)bytesToWrite;
		outpostmp.add(4);
		bitOffset = 32;
		bytesToWrite = 0;
	}
	
	public static void main(String[] args){
		byte[] out= new byte[8];
		IntWrapper outpos = new IntWrapper();
		outpos.set(1);
		BitsWriter bw=new BitsWriter(out, outpos);
		bw.write_bits(65, 7);
		bw.write_bits(3, 2);
		bw.write_bits(98, 7);
		bw.flush_bits();
		System.out.println(outpos.get());
	}


}
