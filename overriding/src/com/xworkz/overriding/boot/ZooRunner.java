package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.NationalZoo;
import com.xworkz.overriding.app.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
    System.out.println("Running main in ZooRunner");
		
		Zoo zoo=new NationalZoo();
		zoo.saveAnimal();
		zoo.saveAnimal("Mysore Zoo");
		zoo.saveAnimal("Mysore Zoo", "Mysore");
		zoo.saveAnimal("Mysore Zoo", "Mysore", "National Zoo");
		zoo.saveAnimal(1500);
		zoo.saveAnimal("National Zoo", 3500);
		
		System.out.println("****************************");
		
		Zoo zoo1=new NationalZoo();
		zoo1.saveAnimal();
		zoo1.saveAnimal("Mysore Zoo");
		zoo1.saveAnimal("Mysore Zoo", "Mysore");
		zoo1.saveAnimal("Mysore Zoo", "Mysore", "National Zoo");
		zoo1.saveAnimal(1500);
		zoo1.saveAnimal("National Zoo", 3500);

	}
	}

}
