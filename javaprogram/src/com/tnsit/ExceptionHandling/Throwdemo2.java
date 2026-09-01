package com.tnsit.ExceptionHandling;

public class Throwdemo2 {
	static void checkpassword(String password) {
		if(password.length()<6) {
			throw new IllegalArgumentException("Password is too short");
			
		}
		System.out.println("Password accepted");
	}
	public static void main(String[] args) {
		try {
			checkpassword("abcwfdgdadsads");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
