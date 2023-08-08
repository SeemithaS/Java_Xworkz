package com.xworkz.coal.app;

public class CoalRunner {

	public static void main(String[] args) {
		System.out.println("Running main in CoalRunner");
		
		Coal coal=new BestCoal();
		coal.burn();
	}

}
