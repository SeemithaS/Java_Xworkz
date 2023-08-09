package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.DistrictPoliceStation;
import com.xworkz.overriding.app.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HostelRunner");

		PoliceStation station = new DistrictPoliceStation();
		station.protect();
		station.protect("Rajajinagar Police station");
		station.protect("Rajajinagar Police station", "Rajajinagar");
		station.protect("Rajajinagar Police station", "Rajajinagar", 150);
		station.protect(150);
		station.protect("Rajajinagar Police station", 150);

		System.out.println("****************************");
		
		PoliceStation station1 = new DistrictPoliceStation();
		station1.protect();
		station1.protect("Rajajinagar Police station");
		station1.protect("Rajajinagar Police station", "Rajajinagar");
		station1.protect("Rajajinagar Police station", "Rajajinagar", 150);
		station1.protect(150);
		station1.protect("Rajajinagar Police station", 150);

		System.out.println("****************************");
	}

}
