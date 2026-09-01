package com.tnsit.ExceptionHandling;

public class Throwsdemo3 {
	static void Login(String username,String password)throws Exception{
		if(username.equals("admin")) {
		throw new Exception("Invalid username");
	}
	if(!password.equals("1234")) {
		throw new Exception("Invalid password");
		
	}
	System.out.println("login successfully");
	}
	public static void main(String[] args) {
		try {
			Login("soop","1234");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Login process completed");
	}
}
