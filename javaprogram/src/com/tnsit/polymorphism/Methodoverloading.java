package com.tnsit.polymorphism;

//demo for method overloading

class StudentResult{
	void calculateresult(int math,int java,int dbms) {
		int total=math+java+dbms;
		System.out.println("Total marks:"+total);
	
	}
	void calculateresult(int math,int python) {
		int total=math+python;
		System.out.println("Total marks:"+total);
	}
	void calculateresult(int totalmarks,double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("final marks:"+finalmarks);
	}
}


public class Methodoverloading {
public static void main(String[] args) {
	StudentResult s=new StudentResult();
	s.calculateresult(50,60,70);
	s.calculateresult(70, 60);
	s.calculateresult(200,5.0);
}
}
