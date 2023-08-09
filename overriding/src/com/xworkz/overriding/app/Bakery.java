package com.xworkz.overriding.app;

public class Bakery {
	
	public void sell() {
		System.out.println("Invoking serve in Bakery");
	}
	
	public void sell(String name) {
		System.out.println("Invoking serve with name in Bakery");
	}
	
	public void sell(String name,String location) {
		System.out.println("Invoking serve with name and location in Bakery");
	}
	
	public void sell(String name,String location,String bakeryType) {
		System.out.println("Invoking serve with name, location and bakeryType in Bakery");
	}
	
	public void sell(int noOfEmployees) {
		System.out.println("Invoking serve with noOfEmployees in Bakery");
	}
	
	public void sell(String bakeryType,int noOfEmployees) {
		System.out.println("Invoking serve with bakeryType and noOfEmployees in Bakery");
	}
	

}
