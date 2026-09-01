package com.tnsit.ExceptionHandling;

public class ArrayIndexdemo {
	public static void main(String[] args) {
		int marks[]= {14,67,89,50};
		try {
			System.out.println(marks[2]);
			System.out.println(marks[3]);
			System.out.println(marks[5]);
		}
		catch(ArrayIndexOutOfBoundsException t) {
			System.out.println(t.getMessage());
		}
	}

}
