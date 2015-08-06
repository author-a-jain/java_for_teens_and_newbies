package com.alok.inheritance.examples;

public class Rectangle  extends Shape{

	protected double width; 
	protected double length; 
	
	public Rectangle (double length, double width) {       
        this.length = length;
        this.width = width;
    }
	
	public double area () {
        return length * width;
    }
	
	public double area (double w,double l) {
        
        return w * l;
    }
	
	
	public int area (int w,int l) {
        
        return w * l;
    }
}
