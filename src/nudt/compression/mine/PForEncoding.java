package nudt.compression.mine;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * changed by Kun Jiang
 * @author <a href="mailto:olanatv@stud.ntnu.no">Ola Natvig</a>, <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>, 
 * @version $Id $.
 */
public class PForEncoding {

		private final int[] intermediateBuffer = new int[256];
        private final int[] outputBuffer = new int[256];
        private final int[] exceptions = new int[256];
        private final int[] exceptionIndexes = new int[256];
        private final int[] simple9Buffer = new int[256];

        private int padLimit;

        public int PadLimit(){
            return padLimit;
        }

        public PForEncoding(){
        	 padLimit = PForSettings.PadLimit;
        }
        
        public PForEncoding(int padLimit){
            this.padLimit = padLimit;
        }

        public void encodeSingle(ByteBuffer buffer, int[] values, int valuesOffset, int count){
        	//Chunks with less than 100 entries are VByte compressed
            if (count < padLimit){
                encodeWithFallbackMechanism(buffer, values, valuesOffset, count);
            } else {
            	//all the values minus frame {3,4,5} frame=3
	            int frame;
				try {
					frame = PForUtils.minimumFoR(count, values, valuesOffset);
				
	            
	            if (count < 256){//values include 0s useless?
	            	if (valuesOffset + 256 < values.length){//never happens
	            		padRemainingSlots(frame, count, valuesOffset, values);
	            	} else {//move to the front, should pad with frame
	            		values = copyAndPadRemainingSlots(frame, count, valuesOffset, values);
	            		valuesOffset = 0;
	            	}
	            }//用frame补充为256个数字
	            
	            int width = PForUtils.log2HistogramAnalyze(PForSettings.InRangeRequirement, frame, values, valuesOffset);
	            clearOutput();
	            
	            int numException = PForCore.encode(
	                width, frame, values, intermediateBuffer, valuesOffset, outputBuffer, exceptionIndexes, exceptions);
	
	            int outputWord = 0;
	            for (int i = 0;
	                 i < numException;
	                 i += Simple9.encode(i, outputWord, exceptions, simple9Buffer), outputWord++);
	            for (int i = 0;
	                 i < numException;
	                 i += Simple9.encode(i, outputWord, exceptionIndexes, simple9Buffer), outputWord++);
	            //通过outputWord来控制数组simple9Buffer中的有效元素
	            //int codeBytes = width << 4;
	            
	            int start = buffer.position();
	            IntBuffer intbuffer = buffer.asIntBuffer();

	            int temp=PForUtils.createControlWord(width, numException, frame);
	            intbuffer.put(PForUtils.createControlWord(width, numException, frame));//control field 1-32bits
	            intbuffer.put(outputBuffer, 0, width<<3);//data field, width*256/32=width*8
	            intbuffer.put(simple9Buffer, 0, outputWord);//exception field
	            
	            buffer.position(start + (intbuffer.position() << 2));
	            //System.out.println(buffer.position());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }

        //VByte
        private void encodeWithFallbackMechanism(ByteBuffer buffer, int[] values, int valuesOffset, int count){
            for (int i = valuesOffset; i < valuesOffset + count; i++){
                VByte.encode(values[i], buffer);
            }
        }

        private void padRemainingSlots(int frameOfReference, int startAt, int valuesOffset, int[] values){
        	for (int i = startAt; i < 256; i++){
                values[valuesOffset + i] = frameOfReference;
            }
        }

        //padding frameOfReference start at index startAt
        private int[] copyAndPadRemainingSlots(int frameOfReference, int startAt, int valuesOffset, int[] values){
            int out[] = new int[256];
            for (int i = 0; i < startAt; i++)
            	out[i] = values[valuesOffset+i];
        	for (int i = startAt; i < 256; i++)
        		out[i] = frameOfReference;
        	return out;
        }
        
        private void clearOutput(){
        	for (int i=0; i<256; i++){
        		outputBuffer[i] = 0;
        	}
        }
}
