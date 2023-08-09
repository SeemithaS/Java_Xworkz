
package com.xworkz.overriding.app;

public class StudioTheatre extends Theatre {
	
	@Override
	public void playMovies() {
		System.out.println("Invoking playMovies in StudioTheatre");
	}
	@Override
	public void playMovies(String name) {
		System.out.println("Invoking playMovies with name in StudioTheatre");
	}
	@Override
	public void playMovies(String name,String location) {
		System.out.println("Invoking playMovies with name and location in StudioTheatre");
	}
	@Override
	public void playMovies(String name,String location,String theatreType) {
		System.out.println("Invoking playMovies with name, location and theatreType in StudioTheatre");
	}
	@Override
	public void playMovies(int noOfEmployees) {
		System.out.println("Invoking playMovies with noOfEmployees in StudioTheatre");
	}
	@Override
	public void playMovies(String name,int noOfEmployees) {
		System.out.println("Invoking playMovies with name and noOfEmployees in StudioTheatre");
	}

}
