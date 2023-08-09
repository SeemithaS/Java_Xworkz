package com.xworkz.overriding.app;

public class GeneralHospital extends Hospital {
	@Override
	public void treatment() {
		System.out.println("Invoking treatment in Hospital");
	}
	@Override
	public void treatment(String name) {
		System.out.println("Invoking treatment with name in Hospital");
	}
	@Override
	public void treatment(String name,String location) {
		System.out.println("Invoking treatment with name and location in Hospital");
	}
	@Override
	public void treatment(String name,String location,String hospitalType) {
		System.out.println("Invoking treatment with name, location and hospitalType in Hospital");
	}
	@Override
	public void treatment(int noOfEmployees) {
		System.out.println("Invoking treatment with noOfEmployees in Hospital");
	}
	@Override
	public void treatment(String name,int noOfEmployees) {
		System.out.println("Invoking treatment with name and noOfEmployees in Hospital");
	}

}
