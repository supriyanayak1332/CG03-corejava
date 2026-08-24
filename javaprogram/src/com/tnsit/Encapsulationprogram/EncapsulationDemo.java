package com.tnsit.Encapsulationprogram;

import java.util.Scanner;

//demo for encapsulation 

class BankAccount {
	
	//private data members
	
	private String AccountHolder;
	private double balance;
	
	//parameter
	
	public BankAccount(String accountHolder, double balance) {
		super();
		AccountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//deposit method
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("amount deposit successfully");
		}
		else {
			System.out.println("invalid amount"); 
		}
	}
	
	//withdraw method
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdraw successfully");
		}
		else {
			System.out.println("invalid amount or insufficient balance");
		}
	}
	public void display() {
		System.out.println("account holder"+AccountHolder);
		System.out.println("Balance"+balance);
	}
}

	public class EncapsulationDemo{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter account holder name");
			String name=sc.nextLine();
			
			System.out.println("enter initial balance:");
			double balance=sc.nextInt();
			
			BankAccount b=new BankAccount(name,balance);
			
			b.display();
			System.out.println("enter amount to deposit");
			double depositamount=sc.nextDouble();
			b.deposit(depositamount);
			
			System.out.println("enter amount to withdraw");
			double withdraw=sc.nextDouble();
			b.withdraw(withdraw);
			System.out.println("final balance"+b.getBalance());
			sc.close();
		}
	}
	
    

