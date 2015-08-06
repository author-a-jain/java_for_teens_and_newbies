package com.alok.inheritance.examples;

public class Square extends Rectangle{

	private double side; 

	public Square (double side) {       
        super(side,side); 
        this.side = side ;
    }
	
	public double area () {
        
        return length * width;
    }
	
	
}
