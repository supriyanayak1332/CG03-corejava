package com.tnsit.lambdaexpressiondemo;

@FunctionalInterface
interface draw{
	public void draw();	
}

public class Withlambda {
public static void main(String[] args) {
	int width=90;
	draw d2=()->{System.out.println("draw:"+width);};              //lambda expressions
	d2.draw();
	}
}

