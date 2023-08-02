package com.xworkz.inheritance.eigthlevel.app;

public class Animal {
	
	public String name="Monkey";
	
	public Animal() {
		System.out.println("Invoking no arg constructor in Animal");
		System.out.println("Animal name:"+name);
	}
	
	public void drink() {
		System.out.println("Invoking drink in Animal");
	}

}
