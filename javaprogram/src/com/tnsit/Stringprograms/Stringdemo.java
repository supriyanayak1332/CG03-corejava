package com.tnsit.Stringprograms;

public class Stringdemo {
public static void main(String[] args) {
	
	//creating a string
	String s="Hello Java Programming";
	
	//length()
	System.out.println("length:"+s.length());
	
	//charAt()
    System.out.println("Character at the index 7:"+s.charAt(7));
    
    //touppercase and lowercase
    System.out.println("Uppercase:"+s.toUpperCase());
    System.out.println("Lowercase:"+s.toLowerCase());
    
    //contains
    System.out.println(s.contains("Python"));
    
    //startwith
    System.out.println(s.startsWith("Hello"));
    
    //endswith
    System.out.println(s.endsWith("world"));
    
    //replace
    System.out.println(s.replace("Java", "C++"));
    
    System.out.println(s.substring(7,12));
}
}
