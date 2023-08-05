package com.xworkz.ground.boot;

import com.xworkz.ground.app.CricketGround;

public class GroundRunner {

	public static void main(String[] args) {
    System.out.println("Runnin main in RopeRunner");
		
		CricketGround ground=new CricketGround();
		System.out.println("Ground name"+ground.name);
		System.out.println("Ground type"+ground.type);
		System.out.println("Location"+ground.location);
		System.out.println("Entry Fees"+ground.entryFees);
		
		System.out.println("*************************");
		
		CricketGround ground1=new CricketGround("ACA-VCDA","Cricket","Mumbai",15000);
		System.out.println("Ground name"+ground1.name);
		System.out.println("Ground type"+ground1.type);
		System.out.println("Location"+ground1.location);
		System.out.println("Entry Fees"+ground1.entryFees);

	}

}
