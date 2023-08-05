package com.xworkz.mushroom.app;

public class Mushroom {
	
	public String type;
	public int price;
	public float quantity;
	public char size;
	
	public Mushroom(String type,int price,float quantity,char size) {
		
		System.out.println("Invoking String,int,float and char constructor in Mushroom");
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.size=size;

	}
}
