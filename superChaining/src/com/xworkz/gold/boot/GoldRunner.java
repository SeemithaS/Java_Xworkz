package com.xworkz.gold.boot;

import com.xworkz.gold.app.YellowGold;

public class GoldRunner {
	public static void main(String[] args) {
    System.out.println("Runnin main in RopeRunner");
		
		YellowGold gold=new YellowGold();
		System.out.println("Gold type"+gold.type);
		System.out.println("Gold Carrot"+gold.carrot);
		System.out.println("Gold price"+gold.price);
		System.out.println("Gold Weight"+gold.weightInGm);
		
		System.out.println("*************************");
		
		YellowGold gold1=new YellowGold();
		System.out.println("Gold type"+gold1.type);
		System.out.println("Gold Carrot"+gold1.carrot);
		System.out.println("Gold Price"+gold1.price);
		System.out.println("Gold Weight"+gold1.weightInGm);
	}

}
