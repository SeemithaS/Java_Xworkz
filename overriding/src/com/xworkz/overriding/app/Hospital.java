package com.xworkz.overriding.app;

public class Hospital {
	
	public void treatment() {
		System.out.println("Invoking treatment in Hospital");
	}
	
	public void treatment(String name) {
		System.out.println("Invoking treatment with name in Hospital");
	}
	
	public void treatment(String name,String location) {
		System.out.println("Invoking treatment with name and location in Hospital");
	}
	
	public void treatment(String name,String location,String hospitalType) {
		System.out.println("Invoking treatment with name, location and hospitalType in Hospital");
	}
	
	public void treatment(int noOfEmployees) {
		System.out.println("Invoking treatment with noOfEmployees in Hospital");
	}
	
	public void treatment(String name,int noOfEmployees) {
		System.out.println("Invoking treatment with name and noOfEmployees in Hospital");
	}


}
