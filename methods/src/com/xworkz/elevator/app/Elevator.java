package com.xworkz.elevator.app;

public class Elevator {
	
	public String material;
	public double price;
	
	public void lift() {
		System.out.println("Invoking lift in Elevator");
		this.lift("Steel");
		this.lift(90000);
	}
	
	public void lift(String material) {
		System.out.println("Invoking lift with material in Elevator");
		System.out.println("Elevator barnd: "+material);
	}
	
	public void lift(double price) {
		System.out.println("Invoking lift with price in Elevator");
		System.out.println("Elevator price: "+price);
	}
	
	public void lift(String material,double price) {
		System.out.println("Invoking lift with material,price in Elevator");
		this.lift(material);
		this.lift(price);
	}
	

}
