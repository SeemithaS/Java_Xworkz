package com.xworkz.router.app;

public class WirelessRouter extends Router{
	
	public WirelessRouter() {
		super("Wireless",1500,"MI",1200);
		System.out.println("Invoking no-arg constructor of WirelessRouter");	
	}
	
	public WirelessRouter(String type,int price,String brand,double speed)
	{
		super(type,price,brand,speed);
		System.out.println("Invoking arg constructor of WirelessRouter");
		
	}
	

}
