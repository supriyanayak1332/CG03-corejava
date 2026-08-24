package com.tnsit.inheritance;

//demo for multi level

class Vehicle{
	String colour="black";
	
	void speed() {
		System.out.println("High speed");	
	}
	
}
class Car extends Vehicle{
	void engine() {
		System.out.println("good");
				
	}
}
class minicar extends Car{
	void show() {
		System.out.println("good speed");
	}
}

public class Main {
public static void main(String[] args) {
	minicar m= new minicar();
	m.speed();
	m.engine();
	m.show();
	Car c=new Car();
	c.speed();
	}
}
