package com.xworkz.hotel.app;

public class Hotel {
	
	public String name;
	public int noOfCooks;
	
	public void serve() {
		System.out.println("Invoking serve in Hotel");
		this.serve("Shri");
		this.serve(16);
	}
	
	public void serve(String name) {
		System.out.println("Invoking serve with name in Hotel");
		System.out.println("Hotel name: "+name);
	}
	
	public void serve(int noOfCooks) {
		System.out.println("Invoking serve with noOfCooks in Hotel");
		System.out.println("Number of cooks in hotel: "+noOfCooks);
		
	}
	
	public void serve(String brand,int noOfCooks ) {
		System.out.println("Invoking serve with name,noOfCooks in Hotel");
		this.serve(brand);
		this.serve(noOfCooks);
	}
	

}
