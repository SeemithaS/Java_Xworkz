package com.xworkz.daimond.boot;

import com.xworkz.daimond.app.FancyColoredDaimond;

public class DaimondRunner {

	public static void main(String[] args) {
		System.out.println("Running main in DaimondRunner");
		
		FancyColoredDaimond daimond=new FancyColoredDaimond();
		System.out.println("Daimond type"+daimond.type);
		System.out.println("Daimond price"+daimond.price);
		System.out.println("Daimond Color"+daimond.color);
		System.out.println("Daimond Size In mm"+daimond.sizeInMm);
		
		System.out.println("********************");
		
		FancyColoredDaimond daimond1=new FancyColoredDaimond("Mined daimonds","White",86000,5.2f);
		System.out.println("Daimond type"+daimond1.type);
		System.out.println("Daimond price"+daimond1.price);
		System.out.println("Daimond Color"+daimond1.color);
		System.out.println("Daimond Size In mm"+daimond1.sizeInMm);

	}

}
