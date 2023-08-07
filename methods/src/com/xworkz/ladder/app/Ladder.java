package com.xworkz.ladder.app;

public class Ladder {
	
	public String color;
	public double price;
	
	public void fold() {
		System.out.println("Invoking fold in Ladder");
		this.fold("white");
		this.fold(75000);
	}
	
	public void fold(String color) {
		System.out.println("Invoking fold with color in Ladder");
		System.out.println("Ladder barnd: "+color);
	}
	
	public void fold(double price) {
		System.out.println("Invoking fold with price in Ladder");
		System.out.println("Ladder price: "+price);
	}
	
	public void fold(String material,double price) {
		System.out.println("Invoking fold with color,price in Ladder");
		this.fold(material);
		this.fold(price);
	}
	


}
