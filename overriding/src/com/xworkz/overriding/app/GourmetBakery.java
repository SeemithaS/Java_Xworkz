package com.xworkz.overriding.app;

public class GourmetBakery extends Bakery{
	
	@Override
	public void sell() {
		System.out.println("Invoking sell in GourmetBakery");
	}
	@Override
	public void sell(String name) {
		System.out.println("Invoking sell with name in GourmetBakery");
	}
	@Override
	public void sell(String name,String location) {
		System.out.println("Invoking sell with name and location in GourmetBakery");
	}
	@Override
	public void sell(String name,String location,String bakeryType) {
		System.out.println("Invoking sell with name, location and bakeryType in GourmetBakery");
	}
	@Override
	public void sell(int noOfEmployees) {
		System.out.println("Invoking sell with noOfEmployees in GourmetBakery");
	}
	@Override
	public void sell(String bakeryType,int noOfEmployees) {
		System.out.println("Invoking sell with bakeryType and noOfEmployees in GourmetBakery");
	}

}
