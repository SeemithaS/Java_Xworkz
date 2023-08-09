package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.Bakery;
import com.xworkz.overriding.app.GourmetBakery;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HotelRunner");

		Bakery bakery = new GourmetBakery();
		bakery.sell();
		bakery.sell("Shri");
		bakery.sell("Shri", "Bangalore");
		bakery.sell("Shri", "Bangalore", "Gourmet Bakery");
		bakery.sell(6);
		bakery.sell("Gourmet Bakery", 4);

		System.out.println("****************************");

		Bakery bakery1 = new GourmetBakery();
		bakery1.sell();
		bakery1.sell("Shri");
		bakery1.sell("Shri", "Bangalore");
		bakery1.sell("Shri", "Bangalore", "Gourmet Bakery");
		bakery1.sell(6);
		bakery1.sell("Gourmet Bakery", 4);


	}

}
