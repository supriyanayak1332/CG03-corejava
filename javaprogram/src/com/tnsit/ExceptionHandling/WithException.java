package com.tnsit.ExceptionHandling;

public class WithException {
	public static void main(String[] args) {
		System.out.println("Good Morning");
		int a=90;
		int b=0;
		System.out.println("welcome to java");
		try {
		System.out.println(a/b);
		}
		catch(Exception r) {
			System.out.println(r.getMessage());
		}
		System.out.println("Hello World");
}
}