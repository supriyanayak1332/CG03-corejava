package com.tnsit.ExceptionHandling;

public interface Throwsdemo {
	static void calculate(int a,int b) throws ArithmeticException{
		int result=a/b;
		System.out.println("Result:"+result);
	}
	public static void main(String[] args) {
		try {
			calculate(10,0);
		
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}

}
