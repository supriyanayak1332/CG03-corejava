package com.tnsit.polymorphism;

public class Calci {
	double calculateArea(double radius) {
		return Math.PI*radius*radius;
		}
	double calculateArea(double length,double breadth) {
		return length*breadth;
	}
	double calculateArea(int side) {
		return side*side;
	}	
	public static void main(String[] args) {
		Calci c=new Calci();
		System.out.println("Area of circle:"+c.calculateArea(5.0));
		System.out.println("Area of Rectangle:"+c.calculateArea(10.0));
		System.out.println("Area of square:"+c.calculateArea(4));
	}
}
