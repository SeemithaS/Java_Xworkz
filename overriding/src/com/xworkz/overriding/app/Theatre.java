package com.xworkz.overriding.app;

public class Theatre {
	
	public void playMovies() {
		System.out.println("Invoking playMovies in Theatre");
	}
	
	public void playMovies(String name) {
		System.out.println("Invoking playMovies with name in Theatre");
	}
	
	public void playMovies(String name,String location) {
		System.out.println("Invoking playMovies with name and location in Theatre");
	}
	
	public void playMovies(String name,String location,String theatreType) {
		System.out.println("Invoking playMovies with name, location and theatreType in Theatre");
	}
	
	public void playMovies(int noOfEmployees) {
		System.out.println("Invoking playMovies with noOfEmployees in Theatre");
	}
	
	public void playMovies(String name,int noOfEmployees) {
		System.out.println("Invoking playMovies with name and noOfEmployees in Theatre");
	}

}
