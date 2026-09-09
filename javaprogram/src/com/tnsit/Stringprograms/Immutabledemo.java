package com.tnsit.Stringprograms;

public class Immutabledemo {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2=s1;
		String s3=s2;
		
		System.out.println("Before modification");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		s1="tendulkar";
		
		System.out.println("After modification");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		
	}
	


}
