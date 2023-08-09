package com.xworkz.overriding.app;

public class BoutiqueHotel extends Hotel{
	
	@Override
	public void serve() {
		System.out.println("Invoking serve in BoutiqueHotel");
	}
	
	@Override
	public void serve(String name) {
		System.out.println("Invoking serve with name in BoutiqueHotel");
	}
	
	@Override
	public void serve(String name,String location) {
		System.out.println("Invoking serve with name and location in BoutiqueHotel");
	}
	
	@Override
	public void serve(String name,String location,String hotelType) {
		System.out.println("Invoking serve with name, location and hotelType in BoutiqueHotel");
	}
	
	@Override
	public void serve(int noOfCooks) {
		System.out.println("Invoking serve with noOfCooks in BoutiqueHotel");
	}
	
	@Override
	public void serve(String hotelType,int noOfCooks) {
		System.out.println("Invoking serve with hotelType and noOfCooks in BoutiqueHotel");
	}

}
