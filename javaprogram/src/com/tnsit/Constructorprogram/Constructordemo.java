package com.tnsit.Constructorprogram;

class Employee {
	String name;
	int salary;
	
	//default constructor
	Employee(){
		name="unknown";
		salary=50000;
	}
	void display() {
	System.out.println("Name "+name);
	System.out.println("Salary "+salary);
	}
	
}
public class Constructordemo{
public static void main(String[] args) {
	

		Employee e=new Employee();
		e.display();
	}
}
	
