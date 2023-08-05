package com.xworkz.coffee.boot;

import com.xworkz.coffee.app.LibericaCoffee;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("Running main in CoffeeRunner");
		
		LibericaCoffee coffee=new LibericaCoffee();
		System.out.println("Coffee Type: "+coffee.type);
		System.out.println("Coffee shop name: "+coffee.shopName);
		System.out.println("Coffee price: "+coffee.price);
		System.out.println("NUmber Of cups: "+coffee.noOfCups);
		
		System.out.println("##################");
		
		LibericaCoffee coffee1=new LibericaCoffee("Cappuccino","Starbucks",250,1);
		System.out.println("Coffee Type: "+coffee1.type);
		System.out.println("Coffee shop name: "+coffee1.shopName);
		System.out.println("Coffee price: "+coffee1.price);
		System.out.println("NUmber Of cups: "+coffee1.noOfCups);
		


	}

}
