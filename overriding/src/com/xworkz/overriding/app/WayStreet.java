package com.xworkz.overriding.app;

public class WayStreet extends Street {
	
	@Override
	public void ride() {
		System.out.println("Invoking ride in WayStreet");
	}
	@Override
	public void ride(String name) {
		System.out.println("Invoking ride with name in WayStreet");
	}
	@Override
	public void ride(String name,String location) {
		System.out.println("Invoking ride with name and location in WayStreet");
	}
	@Override
	public void ride(String name,String location,String streetType) {
		System.out.println("Invoking ride with name, location and marketType in WayStreet");
	}
	@Override
	public void ride(int noOfStreetLight) {
		System.out.println("Invoking ride with noOfShops in WayStreet");
	}
	@Override
	public void ride(String name,int noOfStreetLight) {
		System.out.println("Invoking ride with name and noOfShops in WayStreet");
	}

}
