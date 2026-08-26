package com.tnsit.statickeyword;

public class StaticBlock {
	static int employeecount;
	static {
		employeecount=100;
	    System.out.println("employee system initialised");
	}
public static void main(String[] args) {
	System.out.println("starting employee system");
	System.out.println("employee count="+employeecount);
}
}
