package com.xworkz.inheritance.forthlevel.app;

public class SeedRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main");
		
		Juice juice=new Juice();
		
		juice.grow();
		juice.growPlant();
		juice.giveOxygen();
		juice.eat();
		juice.drink();
	}

}
