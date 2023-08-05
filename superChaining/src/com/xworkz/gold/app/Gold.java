package com.xworkz.gold.app;

public class Gold {
	
	public String type;
	public String carrot;
	public double price;
	public float weightInGm;
	
	public Gold(String type, String carrot, double price, float weightInGm) {
		this.type=type;
		this.carrot=carrot;
		this.price=price;
		this.weightInGm=weightInGm;
		
		System.out.println("Invoking String,String,double,float in Gold");
	}
	

}
