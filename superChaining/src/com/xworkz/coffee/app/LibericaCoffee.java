package com.xworkz.coffee.app;

public class LibericaCoffee extends Coffee {
	
	public LibericaCoffee() {
		super("Liberica Coffee","Cafe Coffee day",150.0,2);
		System.out.println("Invoking no arg constructor of Liberica Coffee");
	}
	
	public LibericaCoffee(String type,String shopName,double price,int noOfCups) {
		super(type,shopName,price,noOfCups);
		System.out.println("Invoking no arg constructor of Liberica Coffee");
	}

}
