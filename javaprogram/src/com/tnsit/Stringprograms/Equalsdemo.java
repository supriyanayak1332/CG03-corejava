package com.tnsit.Stringprograms;

public class Equalsdemo {
	public static void main(String[] args) {
		String s1="Manu";
		String s2=new String("Manu");
		String s3="sana";
		String s4="Manu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
