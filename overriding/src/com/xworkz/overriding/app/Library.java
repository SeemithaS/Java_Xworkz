package com.xworkz.overriding.app;

public class Library {
	
	public void store() {
		System.out.println("Invoking store in Library");
	}
	
	public void store(String name) {
		System.out.println("Invoking store with name in Library");
	}
	
	public void store(String name,String location) {
		System.out.println("Invoking store with name and location in Library");
	}
	
	public void store(String name,String location,int entryFees) {
		System.out.println("Invoking store with name, location and entryFees in Library");
	}
	
	public void store(int noofBooks) {
		System.out.println("Invoking store with noofBooks in Library");
	}
	
	public void store(String name,int noofBooks) {
		System.out.println("Invoking store with name and noOfEmployees in Library");
	}



}
