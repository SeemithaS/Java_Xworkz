package com.xworkz.overriding.app;

public class SmartCity extends City {
	@Override
	public void stay() {
		System.out.println("Invoking stay in SmartCity");
	}
	@Override
	public void stay(String name) {
		System.out.println("Invoking stay with name in SmartCity");
	}
	@Override
	public void stay(String name,String state) {
		System.out.println("Invoking stay with name and state in SmartCity");
	}
	@Override
	public void stay(String name,String location,double pincode) {
		System.out.println("Invoking stay with name, state and pincode in SmartCity");
	}
	@Override
	public void stay(double pincode) {
		System.out.println("Invoking stay with noOfEmployees in SmartCity");
	}
	@Override
	public void stay(double pincode,int noOfPeoples) {
		System.out.println("Invoking stay with pincode and noOfPeoples in SmartCity");
	}

}
