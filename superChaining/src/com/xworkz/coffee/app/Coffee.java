package com.xworkz.coffee.app;

public class Coffee {
	
	public String type;
	public String shopName;
	public double price;
	public int noOfCups;
	
	public Coffee(String type,String shopName,double price,int noOfCups) {
		this.type=type;
		this.shopName=shopName;
		this.price=price;
		this.noOfCups=noOfCups;
		
		System.out.println("Invoking String,String,double,int in Coffee");
	}

}
