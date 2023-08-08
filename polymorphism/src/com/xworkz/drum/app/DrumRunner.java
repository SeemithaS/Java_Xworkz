package com.xworkz.drum.app;

public class DrumRunner {

	public static void main(String[] args) {
		System.out.println("Running main in DrumRunner");
		
		Drum drum=new BassDrum();
		drum.noise();

	}

}
