package com.alok.minions;

public class Minion {
	private String name ;
	private int  age = 10 ;
	private String color = "";
	
	public Minion(){
	
	}
	
	public Minion(String name, int age){
		this.name = name ;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setName(String firstName,String lastName) {
		this.name = firstName + " " + lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
