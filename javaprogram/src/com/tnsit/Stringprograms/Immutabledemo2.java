package com.tnsit.Stringprograms;

public class Immutabledemo2 {
	public static void main(String[] args) {
		
		String str=new String("hello");
		System.out.println(str);
		
		//str.concat("welcome to java");               it will not concatenate  
		str=str.concat("world") ;
		System.out.println(str);
		
	}

}
