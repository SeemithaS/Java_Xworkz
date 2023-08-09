package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.Street;
import com.xworkz.overriding.app.WayStreet;

public class StreetRunner {

	public static void main(String[] args) {
    System.out.println("Running main in StreetRunner");
		
		Street street=new WayStreet();
		street.ride();
		street.ride("Fleet Street");
		street.ride("Fleet Street", "Bnagalore");
		street.ride("Fleet Street", "Bnagalore", "Way Street");
		street.ride(1200);
		street.ride("Fleet Street", 1200);
		
		System.out.println("****************************");
		
		Street street1=new WayStreet();
		street1.ride();
		street1.ride("Fleet Street");
		street1.ride("Fleet Street", "Bnagalore");
		street1.ride("Fleet Street", "Bnagalore", "Way Street");
		street1.ride(1200);
		street1.ride("Fleet Street", 1200);

	}

}
