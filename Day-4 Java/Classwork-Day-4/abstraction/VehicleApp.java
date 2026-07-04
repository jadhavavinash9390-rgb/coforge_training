package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Bike honda = new Bike();
		honda.noOfWheels();
		honda.brandName();
		honda.noOfEngine();
		
		Scooty Activa = new Scooty();
		Activa.noOfWheels();
		Activa.brandName();
		Activa.noOfEngine();
		
*/
		VehiclePlan vehicle;
		
		vehicle = new Bike();
		vehicle.noOfWheels();
	    vehicle.brandName();
		vehicle.noOfEngine();
		
		vehicle = new Scooty();
		vehicle.noOfWheels();
	    vehicle.brandName();
		vehicle.noOfEngine();
	}

}
