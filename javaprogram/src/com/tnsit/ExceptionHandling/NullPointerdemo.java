package com.tnsit.ExceptionHandling;

public class NullPointerdemo {
public static void main(String[] args) {
	String str=null;
	try {
		System.out.println(str.length());
	}
	catch(NullPointerException n) {
		System.out.println(n.getMessage());
	}
	System.out.println("Program continue...");
}
}
