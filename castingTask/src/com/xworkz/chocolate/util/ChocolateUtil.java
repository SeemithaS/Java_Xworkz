package com.xworkz.chocolate.util;

public class ChocolateUtil {
	
	public static void eat(Chocolate chocolate) {
		
		System.out.println("Chocolate Brand: "+chocolate.brand);
		chocolate.taste();
		
		if(chocolate instanceof DarkChocolate) {
			System.out.println("Acessing DarkChocolate");
			DarkChocolate chocolate1=(DarkChocolate)chocolate;
			
			System.out.println("Dark Chocolate Price"+chocolate1.price);
			chocolate1.provideNutrients();
		}
		
		if(chocolate instanceof CaramelChocolate) {
			System.out.println("Acessing CaramelChocolate");
			CaramelChocolate chocolate2=(CaramelChocolate)chocolate;
			
			System.out.println("Caramel Chocolate Price"+chocolate2.sugarInGms);
			chocolate2.boostEnergy();
		}
	}

}
