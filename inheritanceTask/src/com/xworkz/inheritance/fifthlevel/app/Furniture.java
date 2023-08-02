package com.xworkz.inheritance.fifthlevel.app;

public class Furniture extends Wood{
	
	public String type;
	
	public Furniture() {
		System.out.println("Invoking no arg constructor in Wood");
		System.out.println("Furniture type:"+type);
	}
	
	public void make() {
		System.out.println("Invok make in Furniture");
	}

}
