package com.xworkz.overriding.app;

public class HinduTemple extends Temple{
	
	@Override
	public void spirtual() {
		System.out.println("Invoking spirtual in HinduTemple");
	}
	
	@Override
	public void spirtual(String name) {
		System.out.println("Invoking spirtual with name in HinduTemple");
	}
	
	@Override
	public void spirtual(String name,String location) {
		System.out.println("Invoking spirtual with name and location in HinduTemple");
	}
	
	@Override
	public void spirtual(String name,String location,int noOfWorkers) {
		System.out.println("Invoking spirtual with name, location and noOfWorkers in HinduTemple");
	}
	
	@Override
	public void spirtual(int noOfWorkers) {
		System.out.println("Invoking spirtual with noOfWorkers in HinduTemple");
	}
	
	@Override
	public void spirtual(String name,int noOfWorkers) {
		System.out.println("Invoking spirtual with name and noOfWorkers in HinduTemple");
	}

}
