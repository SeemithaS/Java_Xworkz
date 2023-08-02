package com.xworkz.inheritance.app.singlelevel.app;

public class ComputerRunner {

	public static void main(String[] args) {
	
		System.out.println("Running main in ComputerRunner");
		
		//Computer computer=new Laptop();
		Laptop laptop=new Laptop();
	    laptop.turnOn();
		laptop.shutDown();

	}

}
