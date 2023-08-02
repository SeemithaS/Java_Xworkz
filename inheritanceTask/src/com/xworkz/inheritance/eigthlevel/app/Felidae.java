package com.xworkz.inheritance.eigthlevel.app;

public class Felidae extends Carnivore{
	
	public String familyName="Mammal";
	public Felidae() {
		System.out.println("Invoking no arg constructor in Felidae");
		System.out.println("Felidae name:"+familyName);
	}
	
	public void eatFood() {
		System.out.println("Invoking eatFood in Felidae");
	}

}
