package com.xworkz.inheritance.forthlevel.app;

public class Fruit extends Tree{
	
	public String color="Red";
	
	public Fruit() {
		System.out.println("Fruit color is:"+color);
	}
	
	public void eat() {
		System.out.println("invoking eat in Fruit");
	}
}
