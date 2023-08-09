package com.xworkz.overriding.app;

public class Market {
	
	public void shop() {
		System.out.println("Invoking shop in Market");
	}
	
	public void shop(String name) {
		System.out.println("Invoking shop with name in Market");
	}
	
	public void shop(String name,String location) {
		System.out.println("Invoking shop with name and location in Market");
	}
	
	public void shop(String name,String location,String marketType) {
		System.out.println("Invoking shop with name, location and marketType in Market");
	}
	
	public void shop(int noOfShops) {
		System.out.println("Invoking shop with noOfShops in Market");
	}
	
	public void shop(String name,int noOfShops) {
		System.out.println("Invoking shop with name and noOfShops in Market");
	}



}
