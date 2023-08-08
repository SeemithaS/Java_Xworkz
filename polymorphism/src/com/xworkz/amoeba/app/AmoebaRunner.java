package com.xworkz.amoeba.app;

public class AmoebaRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in AmoebaRunner");
		Amoeba amoeba=new ProteusAmoeba();
		
		amoeba.move();

	}

}
