package com.xworkz.inheritance.forthlevel.app;

public class Juice extends Fruit {
	
	public int price=50;
	
	public Juice() {
		System.out.println("Juice price :"+price);
		
	}
	
	public void drink() {
		System.out.println("Invoking drink in Juice");
	}

}
