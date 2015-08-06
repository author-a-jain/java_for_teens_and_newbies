import com.alok.inheritance.examples.Rectangle;
import com.alok.inheritance.examples.Square;


public class InheritenceMain {

	public static void main(String[] args) {
		

		Rectangle rect1 = new Rectangle(4.5,3.5);
		System.out.println("Area of rectangle is: " + rect1.area());
		
		Square sq1 = new Square(2.0);
		System.out.println("Area of Square is: " + sq1.area());
		
		System.out.println("Area of Rect (using overloaded function): " + rect1.area(4.5,2.0));
		
		System.out.println("Area of Square (using functions defined in parent class -- Rectangle): " + sq1.area(4.5,2.0));
		
	}

}
