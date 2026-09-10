package com.tnsif.lambdaexpressiondemo;

interface Area{
	int calculate(int side);
}

public class Square {
	public static void main(String[] args) {
		Area a=(side)->side*side;
		System.out.println(a.calculate(2));
	}
	
}
