package com.xworkz.ground.app;

public class Ground {
	
	public String name;
	public String type;
	public String location;
	public int entryFees;
	
	public Ground(String name,String type,String location,int entryFees) {
		
		this.name=name;
		this.type=type;
		this.location=location;
		this.entryFees=entryFees;
		
		System.out.println("Invoking String ,string,string,int in Ground");
	}

}
