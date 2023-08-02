package com.xworkz.inheritance.seventhlevel.app;

public class ElectricCar extends Car {
	
	public double price;
	
	public ElectricCar() {
		System.out.println("invoking no arg constructor in ElectricCar");
		System.out.println("ElectricCar price"+price);
	}
	
	public void charge() {
		System.out.println("invoking charge in ElectricCar");
	}

}
