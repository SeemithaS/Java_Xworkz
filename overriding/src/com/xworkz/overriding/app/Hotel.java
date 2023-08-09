package com.xworkz.overriding.app;

public class Hotel {
	
	public void serve() {
		System.out.println("Invoking serve in Hotel");
	}
	
	public void serve(String name) {
		System.out.println("Invoking serve with name in Hotel");
	}
	
	public void serve(String name,String location) {
		System.out.println("Invoking serve with name and location in Hotel");
	}
	
	public void serve(String name,String location,String hotelType) {
		System.out.println("Invoking serve with name, location and hotelType in Hotel");
	}
	
	public void serve(int noOfCooks) {
		System.out.println("Invoking serve with noOfCooks in Hotel");
	}
	
	public void serve(String hotelType,int noOfCooks) {
		System.out.println("Invoking serve with hotelType and noOfCooks in Hotel");
	}
	
}
