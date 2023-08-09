package com.xworkz.overriding.app;

public class Temple {
	
	public void spirtual() {
		System.out.println("Invoking spirtual in Temple");
	}
	
	public void spirtual(String name) {
		System.out.println("Invoking spirtual with name in Temple");
	}
	
	public void spirtual(String name,String location) {
		System.out.println("Invoking spirtual with name and location in Temple");
	}
	
	public void spirtual(String name,String location,int noOfWorkers) {
		System.out.println("Invoking spirtual with name, location and noOfWorkers in Temple");
	}
	
	public void spirtual(int noOfWorkers) {
		System.out.println("Invoking spirtual with noOfWorkers in Temple");
	}
	
	public void spirtual(String name,int noOfWorkers) {
		System.out.println("Invoking spirtual with name and noOfWorkers in Temple");
	}


}
