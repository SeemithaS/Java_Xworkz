package com.xworkz.inheritance.forthlevel.app;

public class Plant  extends Seeds{
	
	public int totalLifeSpan=60;
	
	public Plant() {
		System.out.println("Plant total life span:"+totalLifeSpan);
	}
	
	public void growPlant() {
		System.out.println("Invoking growPlant in Plant");
	}

}
