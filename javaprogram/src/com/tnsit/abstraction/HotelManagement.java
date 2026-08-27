package com.tnsit.abstraction;

abstract class Food{
	abstract void FoodDelivery(String Foodname);
	
}

class Idli extends Food{

	@Override
	void FoodDelivery(String Foodname) {
		// TODO Auto-generated method stub
		String food="biryani";
		System.out.println("Food is tasty");
	}
	
}



public class HotelManagement {
	public static void main(String[] args) {
		Idli I=new Idli();
		I.FoodDelivery("Idli");
		System.out.println("I Love Idli");
	}
   

}
