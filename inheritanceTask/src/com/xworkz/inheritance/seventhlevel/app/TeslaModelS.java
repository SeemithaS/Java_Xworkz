package com.xworkz.inheritance.seventhlevel.app;

public class TeslaModelS extends ElectricCar{
	
	public double costInCrore=10.8;
	
	public TeslaModelS() {
		System.out.println("invoking no arg constructor in TeslaModelS");
		System.out.println("TeslaModelS price"+costInCrore);
	}
	
	public void activateSpoiler() {
		System.out.println("invoking activateSpoiler in TeslaModelS");
	}

}
