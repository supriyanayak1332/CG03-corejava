package com.tnsit.ExceptionHandling;

public class Arithematicdemo {
	public static void main(String[] args) {
		int salary=50000;
		int workingday=25;
		int bonusDays=5;
		try {
			int dailysalary=salary/workingday;
			System.out.println("Daily salary:"+dailysalary);
			
			int bonusperday=salary/0;
			System.out.println("Bonus:"+(bonusperday*bonusDays));
		}
		catch(ArithmeticException e) {
			System.out.println("cannot calculate salary bonus");
			System.out.println(e);
			
		}
		System.out.println("salary processing completed...");
	}

}
