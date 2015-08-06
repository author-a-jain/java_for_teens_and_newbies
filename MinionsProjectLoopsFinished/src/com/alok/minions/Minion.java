package com.alok.minions;

public class Minion {
	private String name ;
	private int  age = 10 ;
	private String color = "";
	
	public static int totalMinions = 0;
	
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
