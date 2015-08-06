import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class JavaCollections {

	public static void main(String[] args) {
		
		// ArrayList
		
		ArrayList <String> students = new  ArrayList <String> ();
		students.add("Amy");
		students.add("Ria");
		students.add("Jack");
		students.add("Jill");
		students.add("John");
		
		
		System.out.println("Student ");
		for (String student : students) {
			System.out.println("  " + student  );
		}
		
		// Arrays 
		
		String grades[] = { "A", "B-", "A-", "C+", "A" };
		System.out.println("grades ");
		for (String grade : grades) {
			System.out.println("  " + grade  );
		}
		
		//Arrays Sort 
	      Arrays.sort(grades);
	      
	      System.out.println("Sorted grades ");
			for (String grade : grades) {
				System.out.println("  " + grade  );
			}
	      
	      //Hash Map -- Key Value
	      HashMap <String,String>classGrades = new  HashMap <String,String> ();
			classGrades.put("Amy", "A");
			classGrades.put("Ria", "B-");
			classGrades.put("Jack", "A-");
			classGrades.put("Jill", "C+");
			classGrades.put("John", "A");
			
			System.out.println("Student    Grade ");
			for (Map.Entry<String,String> entry : classGrades.entrySet()) {
				System.out.println("  " + entry.getKey() + " \t   " + entry.getValue() );
			}

	}

}
