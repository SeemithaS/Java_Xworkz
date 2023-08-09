package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.City;
import com.xworkz.overriding.app.SmartCity;

public class CityRunner {

	public static void main(String[] args) {
    System.out.println("Running main in TempleRunner");
		
		City city=new SmartCity();
		city.stay();
		city.stay("Bangalore");
		city.stay("Bangalore", "Karnataka");
		city.stay("Bangalore", "Karnataka",576010);
		city.stay(576010);
		city.stay(576010,140000);
		
		System.out.println("****************************");
		
		City city1=new SmartCity();
		city1.stay();
		city1.stay("Bangalore");
		city1.stay("Bangalore", "Karnataka");
		city1.stay("Bangalore", "Karnataka",576010);
		city1.stay(576010);
		city1.stay(576010,140000);

	}

}
