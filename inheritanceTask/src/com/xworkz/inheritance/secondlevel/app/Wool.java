package com.xworkz.inheritance.secondlevel.app;

public class Wool extends Sheep {
	
	public String type="Angora Wool";
	
	public Wool() {
		System.out.println("Invoking no arg constructor in Wool");
		System.out.println("Wool Type:"+type);
	}
	
	public void makeCloth() {
		System.out.println("invoking makecloth method");
	}

}
