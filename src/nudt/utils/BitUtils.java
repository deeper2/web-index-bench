package nudt.utils;

/**
 * @author <a href="mailto:olanatv@stud.ntnu.no">Ola Natvig</a>, <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>, 
 * @version $Id $.
 */
public class BitUtils {
    private static final int[] multiplyDeBruijnBitPosition =  {
    	0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 
    	31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
    };
    
    private static final int[] multiplyDeBruijnBitPosition2 =  {
    		0, 9, 1, 10, 13, 21, 2, 29, 11, 14, 16, 18, 22, 25, 3, 30,
    		  8, 12, 20, 28, 15, 17, 24, 7, 19, 27, 23, 6, 26, 5, 4, 31
        };
    
   // computes the log base 2 of a 32-bit integer
	public static int MSB(int number){	
        number |= number >>> 1;
        number |= number >>> 2;
        number |= number >>> 4;
        number |= number >>> 8;
        number |= number >>> 16;
        number = (number >>> 1) + 1;
        return multiplyDeBruijnBitPosition[(number * 0x077CB531) >>> 27];
	}
	// computes the log base 2 of a 32-bit integer
	public static int MSB2(int number){	
        number |= number >>> 1;
        number |= number >>> 2;
        number |= number >>> 4;
        number |= number >>> 8;
        number |= number >>> 16;
        return multiplyDeBruijnBitPosition2[(number * 0x07C4ACDD) >>> 27];//
	}

    public static int abs(int number){//absolute value
        int temp = number >> 31;
        return (number ^ temp) - temp;
    }

	public static int min(int a, int b) {//minimum value
        return (a + b - abs((int)a - (int)b)) >> 1;
	}
	
	public static int max(int a, int b) {//maximum value
        return (a + b + abs((int)a - (int)b)) >> 1;
	}
}