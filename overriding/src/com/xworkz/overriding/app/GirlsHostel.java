package com.xworkz.overriding.app;

public class GirlsHostel extends Hostel {
	@Override
	public void stay() {
		System.out.println("Invoking stay in Hostel");
	}
	@Override
	public void stay(String name) {
		System.out.println("Invoking stay with name in Hostel");
	}
	@Override
	public void stay(String name,String location) {
		System.out.println("Invoking stay with name and location in Hostel");
	}
	@Override
	public void stay(String name,String location,int noOfStudents) {
		System.out.println("Invoking stay with name, location and noOfStudents in Hostel");
	}
	@Override
	public void stay(int noOfStudents) {
		System.out.println("Invoking stay with noOfStudents in Hostel");
	}
	@Override
	public void stay(String name,int noOfStudents) {
		System.out.println("Invoking stay with name and noOfStudents in Hostel");
	}
	


}
