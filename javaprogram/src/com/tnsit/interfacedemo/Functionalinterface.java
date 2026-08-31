package com.tnsit.interfacedemo;

interface Vehicle{
	void start();
	
}
class Car implements Vehicle{
	public void start() {
		System.out.println("Car starts");
	}
}

public class Functionalinterface {
public static void main(String[] args) {
	Car c=new Car();
	c.start();
}
}
