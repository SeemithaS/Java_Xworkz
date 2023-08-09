package com.xworkz.overriding.app;

public class DistrictPoliceStation extends PoliceStation{
	
	@Override
	public void protect() {
		System.out.println("Invoking shop in PoliceStation");
	}
	@Override
	public void protect(String name) {
		System.out.println("Invoking shop with name in PoliceStation");
	}
	@Override
	public void protect(String name,String location) {
		System.out.println("Invoking shop with name and location in PoliceStation");
	}
	@Override
	public void protect(String name,String location,int noOfStaffs) {
		System.out.println("Invoking shop with name, location and hospitalType in PoliceStation");
	}
	@Override
	public void protect(int noOfStaffs) {
		System.out.println("Invoking shop with noOfStaffs in PoliceStation");
	}
	@Override
	public void protect(String name,int noOfStaffs) {
		System.out.println("Invoking shop with name and noOfStaffs in PoliceStation");
	}


}
