package com.alok.javastrings;

public class JavaStrings {

	public static void main(String[] args) {
		

		//Multiple ways of creating Strings
		String str1 = new String("Hello Java");
		String str2 = "My Awesome World";
		
		char[] strArray = { 'M', 'i', 'n', 'i', 'o', 'n'};
	      String minionString = new String(strArray);
	      
	   // comparing Strings
		    
		    String text1 = new String("Minions Rule!") ;
		    String text2 = new String("Minions Rule!") ;
		    String text3 = new String("minions rule!") ;

	   // This is wrong way of comparing Strings. 
		    // This compares the objects and not their content
		    if(text1 == text2){
		    	System.out.println("text1 equals text2");
		    } else {
		    	System.out.println("text1 does NOT equals text2");
		    }
		    
		 // This is the correct way of comparing Strings
			if(text1.equals(text2) ){
			  System.out.println("text1 equals text2");
			 } else {
			  System.out.println("text1 does NOT equals text2");
			 }
		// ignorecase
			 if(text1.equalsIgnoreCase(text3) ){
			 System.out.println("text1 equals text3 -- case ignore Case");
			 } else {
			 System.out.println("text1 does NOT equals text3");
		}
			 
			//Example
			    int age = 10;
			    float income = 2000.00f ;
			    double expenses = 1500.00 ;
			    String name = "Stuart" ;
			    String simpleConcat = "name:" + name + " age:" + age + " income:" + income + " expenses:" + expenses ; 	 
			   
			    String formattedString = String.format("name: %s age: %d income:%.4f expenses: %.2f",name,age,income,expenses); 
				
			    System.out.println("Simple formatted");
				System.out.println(simpleConcat);
				System.out.println("Formatted using String.format");
				System.out.println(formattedString);
				
				String title = "How To Be Super cool Dude" ;
				String dash = " -- ";
				String subTitle = "Tips on how to be super cool dude in your class       " ; // notice the extra space at the end
				String fullTitle = "";
				fullTitle = title.concat(dash); // dash added to title
				fullTitle = fullTitle.concat(subTitle); // subtitle added  to full title
				System.out.println(fullTitle);
				
				//length
				System.out.println("length of Title String is: "+ fullTitle.length()); 
				//charAt. Remember arrays start at index 0
				System.out.println("Charater at index 1 is: "+ fullTitle.charAt(1));
				//Substring. Remember arrays start at index 0

				 System.out.println("Substring starting at index 10 and end index 25  is: "+ fullTitle.substring(10, 25));
				 
				//Trim 
				 System.out.println("length of Title String before trim is: "+ fullTitle.length());
				 	    fullTitle = fullTitle.trim();
				 	    System.out.println(fullTitle);
				 	    System.out.println("length of Title String after trim is: "+ fullTitle.length());
				 	    System.out.println("lowercase: "+ fullTitle.toLowerCase());
				 	    System.out.println("upperCase: "+ fullTitle.toUpperCase());
	}

}
