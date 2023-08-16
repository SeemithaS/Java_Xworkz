package com.xworkz.objectTask.boot;

import com.xworkz.objectTask.app.Kercheif;

public class KerchiefRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in KerchiefRunner");
		
		Kercheif kercheif=new Kercheif();
		System.out.println(kercheif);
		
		Kercheif kercheif1=new Kercheif("Allen Solly","Cotton","White",250,200,true,349);
		System.out.println(kercheif1);
		
		
		Kercheif kercheif2=new Kercheif("Kuber","Nylon","Blue",150,200,false,150);
		System.out.println(kercheif2);
		
		
		
	}
	

}
