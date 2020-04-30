package nudt.compression;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;


import nudt.structures.BufferWrapper;

/**
 * @author <a href="mailto:olanatv@stud.ntnu.no">Ola Natvig</a>, <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>, 
 * @version $Id $.
 */
public class NewPForDecoding {
	private final int padLimit;

	private final int[] intermediateBuffer = new int[128];
	private final int[] pforExceptions = new int[128 + 28];
	private final int[] pforExceptionIndexes = new int[128 + 28];

	
    public void decodeSingle(BufferWrapper data, int count, int[] output, int outOffset){
    	if (count < padLimit){
    		decodeWithFallbackMechanism(data, count, output, outOffset);
    	} else {
    		int[] ctrwd = PForUtils.unpackControlWord(data.getInt());
    		int bitWidth = ctrwd[0], chunkLength = ctrwd[1], numberOfExceptions = ctrwd[2], frameOfReference = ctrwd[3];
	    	data.getInt(intermediateBuffer, 0, bitWidth << 2);
	    	try {
		    for (int i = 0; 
		    	i < numberOfExceptions;
		        i += Simple9.decode(data.getInt(), i, pforExceptions));
	
	    	} catch (ArrayIndexOutOfBoundsException ee){
	    		throw ee;
	    	}
	    	
		    for (int i = 0;
		    	i < numberOfExceptions;
		        i += Simple9.decode(data.getInt(), i, pforExceptionIndexes));
	
		    NewPFor.decode(chunkLength, bitWidth, frameOfReference, numberOfExceptions, intermediateBuffer, output, pforExceptions, pforExceptionIndexes, 0, outOffset);
    	}
    }

    public int padLimit(){
    	return padLimit;
    }

    public NewPForDecoding(){
   		this.padLimit = PForSettings.PadLimit;
    }
    
    public NewPForDecoding(int padLimit){
    	this.padLimit = padLimit;
	}
    
    
    private void decodeWithFallbackMechanism(BufferWrapper data, int count, int[] output, int outOffset){
		for (int i = 0; i < count; i++){
			output[outOffset++] = VByte.decode(data);
		}
	}
}