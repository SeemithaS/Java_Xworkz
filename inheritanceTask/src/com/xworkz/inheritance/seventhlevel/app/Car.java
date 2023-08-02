package com.xworkz.inheritance.seventhlevel.app;

public class Car extends LandVehicle{
	
	public String brand="Swift";
	
	public Car() {
		System.out.println("invoking no arg constructor in Car");
		System.out.println("brand"+brand);
	}
	
	public void drive() {
		System.out.println("invoking drive in Car");
	}

}
