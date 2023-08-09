package com.xworkz.overriding.app;

public class StreetMarket extends Market {
	
	@Override
	public void shop() {
		System.out.println("Invoking shop in StreetMarket");
	}
	
	@Override
	public void shop(String name) {
		System.out.println("Invoking shop with name in StreetMarket");
	}
	
	@Override
	public void shop(String name,String location) {
		System.out.println("Invoking shop with name and location in StreetMarket");
	}
	
	@Override
	public void shop(String name,String location,String marketType) {
		System.out.println("Invoking shop with name, location and marketType in StreetMarket");
	}
	@Override
	public void shop(int noOfShops) {
		System.out.println("Invoking shop with noOfShops in StreetMarket");
	}
	
	@Override
	public void shop(String name,int noOfShops) {
		System.out.println("Invoking shop with name and noOfShops in StreetMarket");
	}


	

}
