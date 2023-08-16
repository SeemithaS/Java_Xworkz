package com.xworkz.objectTask.boot;

import com.xworkz.objectTask.app.Pendant;

public class PendantRunner {

	public static void main(String[] args) {
		
		Pendant pendant=new Pendant();
		System.out.println(pendant);
		
		Pendant pendant1=new Pendant("Giva",15000,"daimond","Square","20-07-2023",10,25,50,"Daimond",true,"red","rope",true,1,true);
		System.out.println(pendant1);
		
		Pendant pendant2=new Pendant("Caratlane",18000,"daimond","Traingle","25-07-2023",10,25,50,"Daimond",true,"white","curb",true,1,true);
		System.out.println(pendant2);
		
		

	}

}
