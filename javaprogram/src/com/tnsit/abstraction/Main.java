package com.tnsit.abstraction;

abstract class Employee{
	String name;
	Employee(String name){
		this.name=name;
	}
	abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println(name+"salary:"+calculateSalary());
	}
}

class FullTimeEmployee extends Employee{
	private double monthlySalary;
	FullTimeEmployee(String name,double monthlySalary){
		super(name);
		this.monthlySalary=monthlySalary;
		
	}
	@Override
	double calculateSalary(){
    return monthlySalary;


}
}

class PartTimeEmployee extends Employee{
	private int hoursworked;
	private double hourlyRate;
	
	PartTimeEmployee(String name,int hoursworked,double hourlyRate){
		super(name);
		this.hoursworked=hoursworked;
		this.hourlyRate=hourlyRate;
		
	}
	@Override
	double calculateSalary() {
		return hoursworked*hourlyRate;
	}
}



public class Main {
	public static void main(String[] args) {
		Employee f=new FullTimeEmployee("Jay",5000);
		Employee p=new PartTimeEmployee("Raya",45,30);
		f.displayDetails();
		p.displayDetails();
	}

}
