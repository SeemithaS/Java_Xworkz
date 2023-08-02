package com.xworkz.inheritance.seventhlevel.app;

public class Vehicle {
	public int noOfWheels=6;
	
	public Vehicle() {
		System.out.println("invoking no arg constructor in Vehicle");
		System.out.println("Vehicle noOfWheels"+noOfWheels);
	}
	
	public void start() {
		System.out.println("invoking start in Vehicle");
	}

}
