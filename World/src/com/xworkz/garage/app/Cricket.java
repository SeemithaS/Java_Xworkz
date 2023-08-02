package com.xworkz.garage.app;

public class Cricket {
	
	public static String name;
	public int num;
	public String type;
	
	public static void over(String name,int num) {
		
		System.out.println(name);
		System.out.println(num);
		
	}
	
	
	public void play(String name,int num) {
		System.out.println(name);
		System.out.println(num);
	}
	

	public void play(int num,String type) {
		//System.out.println(name);
		System.out.println(num);
		System.out.println(type);
	}

}
