package com.xworkz.garage.boot;

import com.xworkz.garage.app.Cricket;

public class CricketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket.name="Shravya"; //static variable initilalization
		int num=30;
		String type1="bat";  // non-static variable initilalization
		
		Cricket.over(Cricket.name,num); //static variable acess
		
	
		Cricket cricket=new Cricket(); 
		cricket.play("Archana",num);//non static acess
		cricket.play(num,type1);//non static
	
	}

}
