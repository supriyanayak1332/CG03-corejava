package com.tnsit.Encapsulationprogram;

import java.util.Scanner;

class Employe{
	private int employeId;
	private String employeName;                                  
	private double salary;
	private String department;
	
	
	Employe(int employeid,String employeName,double salary,String department){          
		this.employeId=employeId;
		this.employeName=employeName;                                     
		this.department=department=department;
		this.salary=salary;
		
	}
	

public int getEmployeId() {
		return employeId;
	}


	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}


	public String getEmployeName() {
		return employeName;
	}


	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
public void increaseSalary(double percentage) {
	salary=salary+(salary*percentage/100);
}

public void displayEmployeDetails() {
	System.out.println("Employe ID:"+employeId);
	System.out.println("Employe Name:"+employeName);
	System.out.println("Department:"+department);
	System.out.println("salary:"+salary);
	System.out.println();
}
}

public class Employee {
	public static void main(String[] args) {
		Employe emp1=new Employe(101,"sup",40000,"IT");
		Employe emp2=new Employe(101,"priya",50000,"Hr");
		
		System.out.println("Employee Details:");
		System.out.println();
		
		emp1.displayEmployeDetails();
		emp2.displayEmployeDetails();
		
		emp1.increaseSalary(10);
		System.out.println("After salary Increase");
	    System.out.println();
		
	    emp1.displayEmployeDetails();
		emp2.displayEmployeDetails();		
		
	}
	
}
	

