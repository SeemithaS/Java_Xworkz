package com.xworkz.overriding.app;

public class Street {
	
	public void ride() {
		System.out.println("Invoking ride in Street");
	}
	
	public void ride(String name) {
		System.out.println("Invoking ride with name in Street");
	}
	
	public void ride(String name,String location) {
		System.out.println("Invoking ride with name and location in Street");
	}
	
	public void ride(String name,String location,String streetType) {
		System.out.println("Invoking ride with name, location and streetType in Street");
	}
	
	public void ride(int noOfStreetLight) {
		System.out.println("Invoking ride with noOfShops in Street");
	}
	
	public void ride(String name,int noOfStreetLight) {
		System.out.println("Invoking ride with name and noOfShops in Street");
	}

}
