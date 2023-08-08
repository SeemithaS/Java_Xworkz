package com.xworkz.mic.app;

public class MicRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in MicRunner");
		
		Mic mic=new DynamicMic();
		mic.makeSound();
	}

}
