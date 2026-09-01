package com.tnsit.interfacedemo;

interface GPS{
	Void tracklocation();
	void calculateRoute();

}
interface VehicleSafety{
	void detectcollision();
	void applyEmergencyBrake();
}
class SmartCar implements GPS,VehicleSafety{
	int vehicleNumber;
	double speed;
	String location;
	

	public SmartCar(int vehicleNumber, double speed, String location) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.speed = speed;
		this.location = location;
	}

	@Override
	public Void tracklocation() {
		System.out.println("Current location");
		return null;
	}

	@Override
	public void calculateRoute() {
		// TODO Auto-generated method stub
		System.out.println("Route:Bangalore->Mysore");
		
	}

	@Override
	public void detectcollision() {
		// TODO Auto-generated method stub
		boolean collision=true;
		if(collision) {
			System.out.println("Emergency brake applied");
			applyEmergencyBrake();
		}
		else {
			System.out.println("No collision detected");
		}
	}

	@Override
	public void applyEmergencyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Emergency brake applied");
		
	}
	public void checkspeed() {
		int speedLimit=80;
		if(speed>speedLimit) {
			System.out.println("speed is Limit exceeded!");
		}
		else {
			System.out.println("speed is within the limit");
		}
	}
	public void displayStatus() {
		System.out.println("Vehicle number:"+vehicleNumber);
		System.out.println("current speed:"+speed+"km/h");
		tracklocation();
		calculateRoute();
	    checkspeed();
	    detectcollision();
	}
	
}
public class Vehicledemo {
	public static void main(String[] args) {
		SmartCar vehicle=new SmartCar(101,90,"Bangalore");
		vehicle.displayStatus();
	}

}
