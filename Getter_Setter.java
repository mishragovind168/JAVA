package com.practice.day1;

public class Employe {

	//Attributes
	private int empid;
	private String name;
	private double salary;
	
	//Accessor or Getter
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {return name;}
	
	public double getSalary() {return salary;}
	
	//Mutators or setter
	public void setEmpid(int id) {empid = id;}
	
	public void setName(String name1) {name = name1;}
	
	public void setSalary(double sal) {salary = sal;}

	
	public static void main(String arg[]) {
		Employe obj = new Employe();
		obj.setName("User01");
		obj.setEmpid(123);
		obj.setSalary(5000);
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpid());
		System.out.println(obj.getSalary());
		
		
		
	}
	

}

