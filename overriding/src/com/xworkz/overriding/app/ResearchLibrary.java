package com.xworkz.overriding.app;

public class ResearchLibrary  extends Library{
	@Override
	public void store() {
		System.out.println("Invoking store in ResearchLibrary");
	}
	@Override
	public void store(String name) {
		System.out.println("Invoking store with name in ResearchLibrary");
	}
	@Override
	public void store(String name,String location) {
		System.out.println("Invoking store with name and location in ResearchLibrary");
	}
	@Override
	public void store(String name,String location,int entryFees) {
		System.out.println("Invoking store with name, location and entryFees in ResearchLibrary");
	}
	@Override
	public void store(int noofBooks) {
		System.out.println("Invoking store with noofBooks in ResearchLibrary");
	}
	@Override
	public void store(String name,int noofBooks) {
		System.out.println("Invoking store with name and noOfEmployees in ResearchLibrary");
	}

}
