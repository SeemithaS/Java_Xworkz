package com.xworkz.daimond.app;

public class FancyColoredDaimond extends Daimond{
	
	public FancyColoredDaimond() {
		super("Fancy Colored","Red",95000.0,5.5f);
		System.out.println("Invoking No-arg constructor in FancyColoredDaimond");
	}
	
	public FancyColoredDaimond(String type,String color,double price,float sizeInMm) {
		super(type,color,price,sizeInMm);
		System.out.println("Invoking arg constructor in FancyColoredDaimond");
	}
	
	

}
