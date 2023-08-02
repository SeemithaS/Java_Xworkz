package com.xworkz.inheritance.secondlevel.app;

public class Sheep {
	
	public String gender;
	
	public Sheep() {
		System.out.println("Invoking no arg constructor in Sheep");
		System.out.println("Sheep gender:"+gender);
	}
	public void eat() {
		System.out.println("Invoking eat");
	}

}
