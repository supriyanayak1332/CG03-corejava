package com.tnsit.interfacedemo;

interface Payment{
	void pay(double amount);         //abstract methods
	void checkstatus();
}
class UPI implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(" Paid "+ amount +" Using upi ");
		
	}

	@Override
	public void checkstatus() {
		// TODO Auto-generated method stub
		System.out.println("upi payment successfully");
		
	}
	
}

	
public class Main {
	public static void main(String[] args) {
		UPI u=new UPI();
		u.pay(1500.09);
		u.checkstatus();
	}

}
