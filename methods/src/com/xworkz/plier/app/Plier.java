package com.xworkz.plier.app;

public class Plier {
	
	public String type;
	public double price;
	
	public void hold() {
		System.out.println("Invoking hold in Plier");
		this.hold("Fencing");
		this.hold(1500);
	}
	
	public void hold(String type) {
		System.out.println("Invoking hold with type in Plier");
		System.out.println("Plier barnd: "+type);
	}
	
	public void hold(double price) {
		System.out.println("Invoking hold with price in Plier");
		System.out.println("Plier price: "+price);
	}
	
	public void hold(String brand,double price) {
		System.out.println("Invoking hold with type,price in Plier");
		this.hold(type);
		this.hold(price);
	}

}
