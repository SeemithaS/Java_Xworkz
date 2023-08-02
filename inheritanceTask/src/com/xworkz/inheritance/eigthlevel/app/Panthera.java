package com.xworkz.inheritance.eigthlevel.app;

public class Panthera extends Pantherinae {
	
	public String family="Pantherinae";
	public Panthera() {
		System.out.println("Invoking no arg constructor in Panthera");
		System.out.println("Panthera name:"+lifeSpan);
	}
	
	public void run() {
		System.out.println("Invoking run in Panthera");
	}

}
