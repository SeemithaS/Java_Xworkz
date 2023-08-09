package com.xworkz.overriding.app;

public class Mall {
	
	public void shop() {
		System.out.println("Invoking shop in Mall");
	}
	
	public void shop(String name) {
		System.out.println("Invoking shop with name in Mall");
	}
	
	public void shop(String name,String location) {
		System.out.println("Invoking shop with name and location in Mall");
	}
	
	public void shop(String name,String location,String mallType) {
		System.out.println("Invoking shop with name, location and hospitalType in Mall");
	}
	
	public void shop(int noOfEmployees) {
		System.out.println("Invoking shop with noOfEmployees in Mall");
	}
	
	public void shop(String name,int noOfEmployees) {
		System.out.println("Invoking shop with name and noOfEmployees in Mall");
	}


}
