package com.xworkz.overriding.app;

public class Pub {
	
	public void entertain() {
		System.out.println("Invoking entertain in Pub");
	}
	
	public void entertain(String name) {
		System.out.println("Invoking entertain with name in Pub");
	}
	
	public void entertain(String name,String location) {
		System.out.println("Invoking entertain with name and location in Pub");
	}
	
	public void entertain(String name,String location,String pubType) {
		System.out.println("Invoking entertain with name, location and pubType in Pub");
	}
	
	public void entertain(int entryFees) {
		System.out.println("Invoking entertain with entryFees in Pub");
	}
	
	public void entertain(String pubType,int entryFees) {
		System.out.println("Invoking entertain with pubType and entryFees in Pub");
	}


}
