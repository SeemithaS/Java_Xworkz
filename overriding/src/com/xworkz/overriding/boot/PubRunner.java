package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.Pub;
import com.xworkz.overriding.app.ThemePub;

public class PubRunner {

	public static void main(String[] args) {
    System.out.println("Running main in StreetRunner");
		
		Pub pub=new ThemePub();
		pub.entertain();
		pub.entertain("Downtown Pub");
		pub.entertain("Downtown Pub", "Bangalore");
		pub.entertain("Downtown Pub", "Bangalore", "Theme Pub");
		pub.entertain(1200);
		pub.entertain("Theme pub", 1200);
		
		System.out.println("****************************");
		
		Pub pub1=new ThemePub();
		pub1.entertain();
		pub1.entertain("Downtown Pub");
		pub1.entertain("Downtown Pub", "Bangalore");
		pub1.entertain("Downtown Pub", "Bangalore", "Theme Pub");
		pub1.entertain(1200);
		pub1.entertain("Theme pub", 1200);

	}
}
