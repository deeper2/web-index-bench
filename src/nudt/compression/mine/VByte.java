package nudt.compression.mine;

import java.nio.ByteBuffer;

import nudt.structures.BufferWrapper;


/**
 * @author <a href="mailto:olanatv@stud.ntnu.no">Ola Natvig</a>, <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>, 
 * @version $Id $.
 */
public class VByte{
	
	public static void encode(int value, ByteBuffer buffer) {
		//byte a=(byte) ((value&127)| 128);
        while (value > 127){
            buffer.put((byte) ((value & 127) | 128));
            value >>>= 7;
        }//127_10=01111111_2
        buffer.put((byte) value);
    }
	
	
	public static int decode(BufferWrapper data){
        int value = 0;
        int shift = 0;
        byte temp;
        do {
        	temp = data.get();
            value += ((temp & 127) << shift);
            shift += 7;
        } while (temp < 0);
        return value;
	}
}