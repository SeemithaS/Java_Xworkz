package com.xworkz.objectTask.boot;

import com.xworkz.objectTask.app.Flag;

public class FlagRunner {
	
	public static void main(String[] args) {
		System.out.println("Invoking main in FlagRunner");
		
		Flag flag=new Flag();
		System.out.println(flag);
		
		Flag flag1=new Flag("India","Cotton",250);
		System.out.println(flag1);
		
		Flag flag2=new Flag("USA","Cotton",200);
		System.out.println(flag2);
		
	}

}
