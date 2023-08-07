package com.xworkz.stapler.app;

public class Stapler {
	
	public String brand;
	public double price;
	
	public void staple() {
		System.out.println("Invoking staple in Stapler");
		this.staple("kangaro");
		this.staple(150);
	}
	
	public void staple(String brand) {
		System.out.println("Invoking staple with barnd in Stapler");
		System.out.println("Stapler barnd: "+brand);
	}
	
	public void staple(double price) {
		System.out.println("Invoking staple with price in Stapler");
		System.out.println("Stapler price: "+price);
	}
	
	public void connect(String brand,double price) {
		System.out.println("Invoking staple with brand,price in Stapler");
		this.staple(brand);
		this.staple(price);
	}
	

}
