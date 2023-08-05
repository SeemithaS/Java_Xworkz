package com.xworkz.router.boot;

import com.xworkz.router.app.WirelessRouter;

public class RouterRunner {

	public static void main(String[] args) {
		System.out.println("Runnin main in RouterRunner");
		
		WirelessRouter router=new WirelessRouter();
		System.out.println("Router type: "+router.type);
		System.out.println("Router type: "+router.price);
		System.out.println("Router brand: "+router.brand);
		System.out.println("Router speed: "+router.speed);
		
		System.out.println("*************************");
		
		WirelessRouter router1=new WirelessRouter("TP-Link",1800,"Asus",1200);
		System.out.println("Router type: "+router1.type);
		System.out.println("Router type: "+router1.price);
		System.out.println("Router brand: "+router1.brand);
		System.out.println("Router speed: "+router1.speed);

	}

}
