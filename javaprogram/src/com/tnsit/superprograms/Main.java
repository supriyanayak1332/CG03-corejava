package com.tnsit.superprograms;

class Employee{
	int salary=50000;
	
}
class SeniorEmployee extends Employee{
	int salary=80000;
	
	void displayinfo() {
		System.out.println("senior employee salary "+ salary);
		System.out.println("Employee salary "+super.salary);
	}
}

public class Main {
public static void main(String[] args) {
	SeniorEmployee s=new SeniorEmployee();
	s.displayinfo();
}
}
