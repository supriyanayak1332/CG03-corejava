package com.tnsit.Constructorprogram;

import java.util.Scanner;

class Employee1 {
	int id;
	String name;                                  //actual parameter
	String department;
	double salary;
	//parameterised constructor
	Employee1(int id,String name,String department,double salary){          //formal parameter
		this.id=id;
		this.name=name;                                     
		this.department=department=department;
		this.salary=salary;
		
	}
void display() {
	System.out.println("Employee details:");
	System.out.println("Employee id:"+id);
	System.out.println("Employee name:"+name);
	System.out.println("Employee salary:"+salary);
}
}
public class Parameterised{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		
        System.out.println("employee name");
        String name=sc.nextLine();
        
        System.out.println("enter the department");
        String department=sc.nextLine();
        
        System.out.println("enter the salary");
        double salary=sc.nextDouble();
        
        Employee1 e=new Employee1(id,name,department,salary);
        e.display();
        sc.close();
}

	
}
