package com.xworkz.theatre.app;

public class TheatreRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TheatreRunner");
		
		Theatre theatre=new StudioTheatre();
		theatre.playMovies();

	}

}
