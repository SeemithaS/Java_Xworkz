package com.xworkz.gold.app;

public class YellowGold extends Gold {

	public YellowGold() {
		super("Yellow Gold", "24k", 56000.80d, 1.0f);
		System.out.println("Invoking No arg Constructor of YellowGold");
	}

	public YellowGold(String type, String carrot, double price, float weightInGm) {
		super(type, carrot, price, weightInGm);
		System.out.println("Invoking No arg Constructor of YellowGold");
	}

}
