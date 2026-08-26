package com.tnsit.superprograms;

class Employeer1{
	void calculatePerformance() {
		System.out.println("evaluating employee performance");
	}
}
class senioremployee extends Employeer1{
	void calculatePerformance() {
		super.calculatePerformance();
		System.out.println("calculating leadership performance");
	}
	
}
public class Supermethod {
public static void main(String[] args) {
    senioremployee s=new senioremployee();
    s.calculatePerformance();
}
}
