package com.tnsif.lambdaexpressiondemo;

interface demo{
	void print();
}

public class Printhello {
	public static void main(String[] args) {
		demo s=()->{System.out.println("hello");};
		s.print();
	}

}
