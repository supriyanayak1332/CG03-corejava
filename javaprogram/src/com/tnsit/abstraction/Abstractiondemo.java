package com.tnsit.abstraction;

abstract class Delivery{       //abstract class
	//abstract method
	abstract double calculateCharge(double distance);              
	//concrete method
	void showDeliveryType() {
		 System.out.println("delivery service selected");
	}
	
}

class BikeDelivery extends Delivery{

	@Override
	double calculateCharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
	
}

class DroneDelivery extends Delivery{

	@Override
	double calculateCharge(double distance) {
		// TODO Auto-generated method stub
		return distance*20;
	}
	
}


public class Abstractiondemo {
public static void main(String[] args) {
	BikeDelivery b=new BikeDelivery();
	System.out.println("Bike charges:"+b.calculateCharge(10));
	
	DroneDelivery d=new DroneDelivery();
	System.out.println("Drone charges:"+d.calculateCharge(20));
}
}
