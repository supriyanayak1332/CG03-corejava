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
	}
}
