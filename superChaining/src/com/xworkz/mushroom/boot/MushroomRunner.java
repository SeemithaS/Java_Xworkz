package com.xworkz.mushroom.boot;

import com.xworkz.mushroom.app.ButtonMushroom;
//import com.xworkz.mushroom.app.Mushroom;

public class MushroomRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in MushroomRunner");
		
		ButtonMushroom mushroom1=new ButtonMushroom();
		System.out.println("Mushroom type"+mushroom1.type);
		System.out.println("Mushroom Quantity"+mushroom1.quantity);
		System.out.println("Mushroom price"+mushroom1.price);
		System.out.println("Mushroom size"+mushroom1.size);
		
		System.out.println("*************************");
		
		ButtonMushroom mushroom2=new ButtonMushroom("Poison",250,1.5f,'S');
		System.out.println("Mushroom type"+mushroom2.type);
		System.out.println("Mushroom Quantity"+mushroom2.quantity);
		System.out.println("Mushroom price"+mushroom2.price);
		System.out.println("Mushroom size"+mushroom2.size);
		
	}

}
