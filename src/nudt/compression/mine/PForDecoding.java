package nudt.compression.mine;

import nudt.structures.BufferWrapper;

/**
 * @author <a href="mailto:olanatv@stud.ntnu.no">Ola Natvig</a>, <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>, 
 * @version $Id $.
 */
public class PForDecoding {
	private final int padLimit;

	private final int[] intermediateBuffer = new int[256];
//	private final int[] pforExceptions = new int[128 + 28];
//	private final int[] pforExceptionIndexes = new int[128 + 28];
	private final int[] pforExceptions = new int[256+27];//+27 是防止放不下最后一个32比特解压的数字
	private final int[] pforExceptionIndexes = new int[256+27];//可能最后simple压缩时只有1个数字另外填充了27个0

    public void decodeSingle(BufferWrapper data, int count, int[] output, int outOffset){
    	if (count < padLimit){
    		for (int i = 0; i < count; i++){
    			output[outOffset++] = VByte.decode(data);
    		}
    	} else {
    		int temp=data.getInt();
    		int[] ctrwd = PForUtils.unpackControlWord(temp);
    		int bitWidth = ctrwd[0], chunkLength = ctrwd[1], numberOfExceptions = ctrwd[2], frameOfReference = ctrwd[3];
	    	data.getInt(intermediateBuffer, 0, bitWidth << 3);
	    	
		    for (int i = 0; 
		    	i < numberOfExceptions;
		        i += Simple9.decode(data.getInt(), i, pforExceptions));
	    	
		    for (int i = 0;
		    	i < numberOfExceptions;
		        i += Simple9.decode(data.getInt(), i, pforExceptionIndexes));

			PForCore.decode(chunkLength, bitWidth, frameOfReference, numberOfExceptions,
					 intermediateBuffer, output, pforExceptions, pforExceptionIndexes, 0, outOffset);
			
		}
    }

    public int padLimit(){
    	return padLimit;
    }

    public PForDecoding(){
   		this.padLimit = PForSettings.PadLimit;
    }
    
    public PForDecoding(int padLimit){
    	this.padLimit = padLimit;
	}
    
}