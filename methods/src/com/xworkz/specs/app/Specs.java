package com.xworkz.specs.app;

public class Specs {
	
	public double power;
	public String type;
	
	public void lens() {
		System.out.println("Invoking lens in Specs");
		this.lens(5.2);
		this.lens("Convex");
	}
	
	public void lens(double power) {
		System.out.println("Invoking lens with power in Specs");
		System.out.println("Specs barnd: "+power);
	}
	
	public void lens(String type) {
		System.out.println("Invoking Iron with price in Specs");
		System.out.println("Specs price: "+type);
	}
	
	public void lens(double power,String type) {
		System.out.println("Invoking Iron with brand,price in Specs");
		this.lens(power);
		this.lens(type);
		
	}
}
