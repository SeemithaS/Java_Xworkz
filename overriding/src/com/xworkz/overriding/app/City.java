package com.xworkz.overriding.app;

public class City {
	
	public void stay() {
		System.out.println("Invoking stay in City");
	}
	
	public void stay(String name) {
		System.out.println("Invoking stay with name in City");
	}
	
	public void stay(String name,String state) {
		System.out.println("Invoking stay with name and state in City");
	}
	
	public void stay(String name,String location,double pincode) {
		System.out.println("Invoking stay with name, state and pincode in City");
	}
	
	public void stay(double pincode) {
		System.out.println("Invoking stay with noOfEmployees in City");
	}
	
	public void stay(double pincode,int noOfPeoples) {
		System.out.println("Invoking stay with pincode and noOfPeoples in City");
	}
}
