package com.xworkz.overriding.app;

public class Hostel {
	
	public void stay() {
		System.out.println("Invoking stay in Hostel");
	}
	
	public void stay(String name) {
		System.out.println("Invoking stay with name in Hostel");
	}
	
	public void stay(String name,String location) {
		System.out.println("Invoking stay with name and location in Hostel");
	}
	
	public void stay(String name,String location,int noOfStudents) {
		System.out.println("Invoking stay with name, location and noOfStudents in Hostel");
	}
	
	public void stay(int noOfStudents) {
		System.out.println("Invoking stay with noOfStudents in Hostel");
	}
	
	public void stay(String name,int noOfStudents) {
		System.out.println("Invoking stay with name and noOfStudents in Hostel");
	}
	

}
