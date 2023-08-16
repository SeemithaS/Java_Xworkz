package com.xworkz.objectTask.app;

public class Flag {
	
	private String country;
	private String clothType;
	private int price;
	
	public Flag() {
		System.out.println("Invoking no arg constructor in Flag");
	}
	
	
	public Flag(String country, String clothType, int price) {
		super();
		this.country = country;
		this.clothType = clothType;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Country name: "+this.country +" Flag Cloth type: " +this.clothType +" Flag Price: "+this.price;
	}

}
