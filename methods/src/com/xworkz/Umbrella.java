package com.xworkz;

public class Umbrella {
	
	public String brand;
	public double price;
	
	public void protect() {
		System.out.println("Invoking protect in Umbrella");
		this.protect("Camel");
		this.protect(550);
	}
	
	public void protect(String brand) {
		System.out.println("Invoking protect with brand in Umbrella");
		System.out.println("Hotel name: "+brand);
	}
	
	public void protect(int price) {
		System.out.println("Invoking protect with price in Umbrella");
		System.out.println("Number of cooks in hotel: "+price);
		
	}
	
	public void protect(String brand,int price ) {
		System.out.println("Invoking protect with brand,price in Umbrella");
		this.protect(brand);
		this.protect(price);
	}

}
