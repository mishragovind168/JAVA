package com.practice.day1;

public class Rectangle{
	private float length,width,radius;
	
	//Constructor
	public Rectangle(float length,float width) {
		this.length = length;
		this.width = width;			
		}
	
	public Rectangle(float radius) {
		this.radius = radius;
		}
	
	
	// Function
	public float calcAreaR() {return length*width;}
	public float calcAreaC() {return radius*radius*(float)3.14;}
	
	
	
	public static void main(String arg[]) {
		Rectangle obj = new Rectangle(5);
		System.out.println(obj.calcAreaC());
		Rectangle obj2=new Rectangle(5,6);
		System.out.println(obj2.calcAreaR());
	}

}
