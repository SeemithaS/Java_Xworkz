package com.xworkz.chocolate.util;

public class ChocolateRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ChocolateRunner");
		
		//Chocolate chocolate =new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.eat(darkChocolate);
		System.out.println("******************");
		ChocolateUtil.eat(caramelChocolate);
	
	}

}
