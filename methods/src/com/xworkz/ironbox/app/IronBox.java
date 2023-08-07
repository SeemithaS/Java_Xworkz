package com.xworkz.ironbox.app;

public class IronBox {
	
	public String brand;
	public double price;
	
	public void iron() {
		System.out.println("Invoking Iron in IronBox");
		this.iron("Philips");
		this.iron(1800);
	}
	
	public void iron(String brand) {
		System.out.println("Invoking Iron with barnd in IronBox");
		System.out.println("Ironbox barnd: "+brand);
	}
	
	public void iron(double price) {
		System.out.println("Invoking Iron with price in IronBox");
		System.out.println("Ironbox price: "+price);
	}
	
	public void iron(String brand,double price) {
		System.out.println("Invoking Iron with brand,price in IronBox");
		this.iron(brand);
		this.iron(price);
	}
	
	

}
