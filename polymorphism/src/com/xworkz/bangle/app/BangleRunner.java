package com.xworkz.bangle.app;

public class BangleRunner {

	public static void main(String[] args) {
		System.out.println("Running main in BangleRunner ");
		
		Bangle bangle=new GlassBangle();
		bangle.sound();
	}

}
