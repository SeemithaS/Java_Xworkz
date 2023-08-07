package com.xworkz.gadget.app;

public class Gadget {
	
	public String brand;
	public double price;
	
	public void connect() {
		System.out.println("Invoking connect in Gadget");
		this.connect("Noise");
		this.connect(1800);
	}
	
	public void connect(String brand) {
		System.out.println("Invoking connect with barnd in Gadget");
		System.out.println("Gadget barnd: "+brand);
	}
	
	public void connect(double price) {
		System.out.println("Invoking connect with price in Gadget");
		System.out.println("Gadget price: "+price);
	}
	
	public void connect(String brand,double price) {
		System.out.println("Invoking connect with brand,price in Gadget");
		this.connect(brand);
		this.connect(price);
	}
	

}
