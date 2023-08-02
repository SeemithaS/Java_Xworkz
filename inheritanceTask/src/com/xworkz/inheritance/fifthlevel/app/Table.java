package com.xworkz.inheritance.fifthlevel.app;

public class Table extends Furniture{
	
	public int price=1500;
	
	public Table() {
		System.out.println("Invoking no arg constructor in table");
		System.out.println("table price:"+price);
	}
	
	public void keepItem() {
		System.out.println("Invoking keepItem in Table");
	}

}
