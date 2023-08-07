package com.xworkz.mouse.app;

public class Mouse {
	
	public String brand;
	public boolean isWireless;
	
	public void click() {
		System.out.println("Invoking click in Mouse");
		this.click("HP");
		this.click(true);
	}
	
	public void click(String brand) {
		System.out.println("Invoking click with barnd in Mouse");
		System.out.println("Mouse barnd: "+brand);
	}
	
	public void click(boolean isWireless) {
		System.out.println("Invoking click with isWireless in Mouse");
		System.out.println("Mouse is wireless or not: "+isWireless);
	}
	
	public void click(String brand,boolean isWireless) {
		System.out.println("Invoking click with brand,isWireless in Mouse");
		this.click(brand);
		this.click(isWireless);
	}

}
