package com.tnsit.ExceptionHandling;

public class Nulldemo {
public static void main(String[] args) {
	String employename="Rahul";
	String department=null;
	String designation="Developer";
	
	try {
		System.out.println("Employee:"+employename);
		System.out.println("Designation:"+designation);
		
		System.out.println("Department:"+department.toUpperCase());
	}
	catch(NullPointerException e) {
		System.out.println("Department information is missing");
		System.out.println(e);
	}
	System.out.println("Program continued....");
}
}
