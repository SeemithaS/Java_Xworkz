package com.xworkz.rope.app;

public class Rope {
	
	public String type;
	public float price;
	public int size;
	public double length;
	
	public Rope(String type,float price,int size,double length)
	{
		this.type=type;
		this.price=price;
		this.size=size;
		this.length=length;
		System.out.println("Invoking String,float,int,double in Rope");
		
	}

}
