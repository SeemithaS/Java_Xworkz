package com.xworkz.objectTask.boot;

import com.xworkz.objectTask.app.Cave;

public class CaveRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in CaveRunner");
		
		Cave cave=new Cave();
		System.out.println(cave);
		
		Cave cave1=new Cave("Ellora",20.03,1500,true,true,600,true,true,"Calcite, Aragonite","Ellora");
		System.out.println(cave1);
		
		Cave cave2=new Cave("Badami",23.03,1200,true,true,578,true,true,"Calcite, Aragonite","Karnataka");
		System.out.println(cave2);
		
	}

}
