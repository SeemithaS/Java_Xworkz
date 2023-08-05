package com.xworkz.router.app;

public class Router {
	
	public String type;
	public int price;
	public String brand;
	public double speed;
	
	public Router(String type,int price,String brand,double speed) {
		this.type=type;
		this.price=price;
		this.brand=brand;
		this.speed=speed;
		System.out.println("Invoking String,int String,double in Router");
	}
}
