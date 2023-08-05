package com.xworkz.daimond.app;

public class Daimond {
	
	public String type;
	public String color;
	public double price;
	public float sizeInMm;
	
	public Daimond(String type,String color,double price,float sizeInMm) {
		
		this.type=type;
		this.color=color;
		this.price=price;
		this.sizeInMm=sizeInMm;
		
		System.out.println("Invoking String,String,double,float in Daimond");
	}
	

}
