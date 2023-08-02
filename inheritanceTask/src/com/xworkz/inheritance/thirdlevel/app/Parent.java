package com.xworkz.inheritance.thirdlevel.app;

public class Parent extends GrandParent{
	
	public int age=50;
	
	public Parent() {
		System.out.println("Invoking no arg constructor of Parent");
		System.out.println("Age is"+age);
	}
	
	public void scold() {
		System.out.println("Invoking scold in Parent");
	}

}
