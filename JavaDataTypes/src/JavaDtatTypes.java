
public class JavaDtatTypes {

	public static void main(String[] args) {
		// Primitive Data Types
		
		
		boolean result = true;
		char capitalC = 'C';
		
		byte b = 100; //8-bit signed two's complement integer
		short s = 10000; //16-bit signed two's complement integer.
		
		/* Minimum value : - 2,147,483,648.(-2^31)
		 * Maximum value : 2,147,483,647(inclusive).(2^31 -1)
		 */
		int i = 100000; //32-bit signed two's complement integer
		
		double d1 = 123.456;//double-precision 64-bit IEEE 754 floating point.
		float f1  = 123.4f; //single-precision 32-bit IEEE 754 floating point
		/*
		 *  long
		 * You can place underscores only between digits but you cannot place underscores in the following places:
			At the beginning or end of a number
			Adjacent to a decimal point in a floating point literal
			Prior to an F or L suffix
			In positions where a string of digits is expected
			
			Minimum value is -9,223,372,036,854,775,808.(-2^63)
			Maximum value is 9,223,372,036,854,775,807 (inclusive). (2^63 -1)
			*/
		
		long creditCardNumber = 1234_5678_9012_3456L; //64-bit signed two's complement integer.
		
		System.out.println(" Credit Card Number " + creditCardNumber);
		
	}

}
