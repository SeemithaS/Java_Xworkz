package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.GeneralHospital;
import com.xworkz.overriding.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
    System.out.println("Running main in HospitalRunner");
		
		Hospital hospital=new GeneralHospital();
		hospital.treatment();
		hospital.treatment("KMC");
		hospital.treatment("KMC", "Manipal");
		hospital.treatment("KMC", "Manipal", "General");
		hospital.treatment(10000);
		hospital.treatment("General", 10000);
		
		System.out.println("****************************");
		
		Hospital hospital1=new GeneralHospital();
		hospital1.treatment();
		hospital1.treatment("KMC");
		hospital1.treatment("KMC", "Manipal");
		hospital1.treatment("KMC", "Manipal", "General");
		hospital1.treatment(10000);
		hospital1.treatment("General", 10000);
	}

}
