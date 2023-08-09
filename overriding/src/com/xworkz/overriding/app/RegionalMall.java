package com.xworkz.overriding.app;

public class RegionalMall extends Mall {
	
	@Override
	public void shop() {
		System.out.println("Invoking shop in Mall");
	}
	@Override
	public void shop(String name) {
		System.out.println("Invoking shop with name in Mall");
	}
	@Override
	public void shop(String name,String location) {
		System.out.println("Invoking shop with name and location in Mall");
	}
	@Override
	public void shop(String name,String location,String mallType) {
		System.out.println("Invoking shop with name, location and hospitalType in Mall");
	}
	@Override
	public void shop(int noOfEmployees) {
		System.out.println("Invoking shop with noOfEmployees in Mall");
	}
	@Override
	public void shop(String name,int noOfEmployees) {
		System.out.println("Invoking shop with name and noOfEmployees in Mall");
	}


}
