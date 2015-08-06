public class NumberAndMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double double1 = -150.123;
		double double2 = 51.23;
		int int1 = 14, int2 = 25;

		System.out.printf("The absolute value " + "of %.3f is %.3f%n", double1,
				Math.abs(double1));

		System.out.printf("The ceiling of " + "%.2f is %.0f%n", double2,
				Math.ceil(double2));

		System.out.printf("The floor of " + "%.2f is %.0f%n", double2,
				Math.floor(double2));

		System.out.printf("The max of %d and " + "%d is %d%n", int1, int2,
				Math.max(int1, int2));

		System.out.printf("The min of of %d " + "and %d is %d%n", int1, int2,
				Math.min(int1, int2));

		System.out.printf("log(%.3f) is " + "%.3f%n", double2,
				Math.log(double2));

		System.out.printf("sqrt(%.3f) is " + "%.3f%n", double2,
				Math.sqrt(double2));

		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		System.out.format("The value of pi " + "is %.4f%n", Math.PI);

		System.out.format("The sine of %.1f " + "degrees is %.4f%n", degrees,
				Math.sin(radians));
		
		// Basic Operations 
		// Addition, subtraction, division , multiplication, modulus
		
		int a = 25 ;
		int b = 5 ;
		int c = 3 ;
		
		System.out.format("Addition:  %d + %d " + "is %d%n", a,b, a + b);
		System.out.format("Subtraction:  %d - %d " + "is %d%n", a,b, a - b);
		System.out.format("Multiplication:  %d * %d " + "is %d%n", a,b, a * b);
		System.out.format("Division:  %d / %d " + "is %d%n", a,c, a / c);
		System.out.format("Modullus:  %d %% %d " + "is %d%n", a,c, a % c);
		
		a++ ; 
		System.out.format("increment:  %d%n  " , a);
		
		b-- ; 
		System.out.format("decrement:  %d%n  " , b);
		
		//Double vs double
		Double double3  = new Double("4.56");
		System.out.format("The value of double3 " + "is %.4f%n", double3);
		System.out.format("The value of double3 is " + double3.toString());

	}

}
