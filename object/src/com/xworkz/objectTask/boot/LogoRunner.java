package com.xworkz.objectTask.boot;

import com.xworkz.objectTask.app.Logo;

public class LogoRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in LogoRunner");
		
		Logo logo=new Logo();
		System.out.println(logo);
		
		Logo logo1=new Logo("My brand","Pink",250,250,"Mine");
		System.out.println(logo1);
		
		Logo logo2=new Logo("Nike","Black",100,250,"Just do it");
		System.out.println(logo2);
		
	
	}

}
