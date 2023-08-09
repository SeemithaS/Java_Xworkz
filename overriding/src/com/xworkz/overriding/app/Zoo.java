package com.xworkz.overriding.app;

public class Zoo {
	public void saveAnimal() {
		System.out.println("Invoking saveAnimal in Zoo");
	}
	
	public void saveAnimal(String zooName) {
		System.out.println("Invoking saveAnimal with zooName in Zoo");
	}
	
	public void saveAnimal(String zooName,String location) {
		System.out.println("Invoking saveAnimal with name and location in Zoo");
	}
	
	public void saveAnimal(String zooName,String location,String zooType) {
		System.out.println("Invoking saveAnimal with name, location and theatreType in Zoo");
	}
	
	public void saveAnimal(int noOfAnimals) {
		System.out.println("Invoking saveAnimal with noOfAnimals in Zoo");
	}
	
	public void saveAnimal(String zooType,int noOfEmployees) {
		System.out.println("Invoking saveAnimal with name and noOfAnimals in Zoo");
	}

}
