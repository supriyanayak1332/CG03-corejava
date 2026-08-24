package com.tnsit.inheritance;

//demo for single level

class Father{
	int money=50000;
	String car="BMW";
	
	void read() {
		System.out.println("reading a newspaper");
	}
	
}

class Son extends Father{
	String cycle="blue";
	
	void play() {
		System.out.println("playing cricket");
	}
}

public class Maindemo {
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.cycle);
		s.read();
		s.play();
		}

}
