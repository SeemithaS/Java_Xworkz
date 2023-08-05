package com.xworkz.ground.app;

public class CricketGround extends Ground{
	
	public CricketGround() {
		super("EadenGarden","Cricket Ground","Bangalore",10000);
		System.out.println("Invoking No arg Constructor of CricketGround");
	}
	
	public CricketGround(String name,String type,String location,int entryFees) {
		super(name,type,location,entryFees);
		System.out.println("Invoking arg Constructor of CricketGround");
	}

}
