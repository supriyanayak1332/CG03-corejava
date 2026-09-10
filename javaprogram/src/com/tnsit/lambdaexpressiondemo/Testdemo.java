package com.tnsit.lambdaexpressiondemo;

import java.util.Scanner;

@FunctionalInterface
interface CabFare{
	double calculate(double distance);
}

public class Testdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the distance in KM:");
	double distance=sc.nextDouble();
    CabFare fare=(d)->{
    	if(d<=5) {
    		return d*15;
    	}
    	else {
    		return(5*10)+((d-5)*12);
    	}
    };
    System.out.println("cab fare:"+fare.calculate(distance));
}
}
