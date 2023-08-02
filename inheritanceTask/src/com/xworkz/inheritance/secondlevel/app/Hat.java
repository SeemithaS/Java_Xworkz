package com.xworkz.inheritance.secondlevel.app;

public class Hat extends Wool{
	
	public int price=250;
	
	public Hat() {
		System.out.println("Invoking no arg constructor in Hat");
		System.out.println("hat price: "+price);
	}
	
	public void wear() {
		System.out.println("invoking wear in Hat");
	}

}
