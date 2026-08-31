package com.tnsit.interfacedemo;

//demo for E-commerce order procession

interface OrderService{
	boolean validateorder(double amount);
	void ProcessPayment(double amount);
	void generateInvoice(String orderId,double amount);
	void UpdateOrderstatus(String orderId,String status);
}

class OnlineOrder implements OrderService{
	
	private String customername;
	private String orderId;
	
//parameter cons
	
	public OnlineOrder(String customername, String orderId) {
		super();
		this.customername = customername;
		this.orderId = orderId;
	}

	@Override
	public boolean validateorder(double amount) {
		if(amount>0) {
			System.out.println("Order validation successfull");
			return true;
		}
		System.out.println("invalid order amount");
		return false;
	}

	@Override
	public void ProcessPayment(double amount) {
	 System.out.println("procession payment :"+amount);
	 System.out.println("payment successfull");
		
	}

	@Override
	public void generateInvoice(String orderId, double amount) {
		// TODO Auto-generated method stub
		System.out.println("invoice generated");
		System.out.println("order id: "+orderId);
		System.out.println("Customer: "+customername);
		System.out.println("Amount: "+amount);
		
		
	}

	@Override
	public void UpdateOrderstatus(String orderId, String status) {
		System.out.println("order: "+ orderId + " status updated to: " +status);
	}
	
}

public class Mainmethod {
public static void main(String[] args) {
	OnlineOrder o=new OnlineOrder("Ruth","ORD101");
	double amount=2444;
	if(o.validateorder(amount)) {
		o.ProcessPayment(amount);
		o.generateInvoice("ORD101", amount);
		o.UpdateOrderstatus("ORD101","confirmed");
	}
}
}
