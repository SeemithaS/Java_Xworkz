package com.xworkz.inheritance.app.singlelevel.app;

public class Laptop extends Computer{
	
public String brand = "HP";
	
	public Laptop() {
		System.out.println("No arg constructor of Laptop");
		System.out.println("Brand: "+brand);
	}

	public void shutDown() {
		System.out.println("Invoking shutDown method in Laptop");
	}

}
