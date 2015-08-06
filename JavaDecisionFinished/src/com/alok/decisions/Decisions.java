package com.alok.decisions;

import java.util.Scanner;

public class Decisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ticketPrice = 0.0 ;
		
		System.out.println("Enter your concert Row (A-F): ");
		Scanner rowScanner = new Scanner(System.in);
		String row = rowScanner.nextLine();
		
		System.out.println("Enter your age ");
		Scanner ageScanner = new Scanner(System.in);
		int age = ageScanner.nextInt();
		//System.out.println("your age "  + age);
		
		if(row.length() > 1 ){
			row = row.substring(0,1) ;
		}
		
		System.out.println("Your row is " + row);
		
		
		if (row.equalsIgnoreCase("A") && age >= 3){
			ticketPrice = 500.00  ;
			//Senior and student discount
			if(age > 55 || age < 18) {
				ticketPrice = ticketPrice * 0.85 ;
			}
		} else if(row.equalsIgnoreCase("B") && age >= 3 ){
			ticketPrice = 400.00 ;
		}else if(row.equalsIgnoreCase("C") && age >= 3){
			ticketPrice = 300.00 ;
		}else if(row.equalsIgnoreCase("D") && age >= 3){
			ticketPrice = 200.00 ;
		}else if(row.equalsIgnoreCase("E") && age >= 3){
			ticketPrice = 100.00 ;
		}else if(row.equalsIgnoreCase("F") && age >= 3){
			ticketPrice = 20.00 ;
		} else {
			System.out.println("You Entered an invalid row number. " );
		}
		
		if(age <  3 ) {
			ticketPrice = 0.0 ; 
		}
		
		
		System.out.format("Your Concert price is  $%.2f " , ticketPrice );
		
		
		// Switch
		System.out.println("Enter your Grade (A-F): ");
		Scanner gradeScanner = new Scanner(System.in);
		String gradeStr = gradeScanner.nextLine();
		char grade = ' ';
		if(row.length() > 0 ){
			grade = gradeStr.charAt(0) ;
		}
		switch (grade) {
		case 'A':
			System.out.println("Excellent grade. Keep up the good work");
			break;
		case 'B':
			System.out.println("Very good grade. ");
			break;
		case 'C':
			System.out.println("Good grade. Try harder next time");
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low grade. You need to work harder");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}
		
		
		// nested if
		
		
	}

}
