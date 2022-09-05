package com.practice.day1;

public class Rectangle{
	private float length,width;
	
	//Constructor
	public Rectangle(float length,float width) {
		this.length = length;
		this.width = width;			
	}
	
	// Function
	public float calcArea() {return length*width;}
	
	
	public static void main(String arg[]) {
		Rectangle obj = new Rectangle(5,6);
		System.out.println(obj.calcArea());
	}

}
