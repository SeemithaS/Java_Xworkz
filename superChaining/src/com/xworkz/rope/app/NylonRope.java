package com.xworkz.rope.app;

public class NylonRope extends Rope{
	
	public NylonRope() {
		super("Nylon",450,22,5.5);
		System.out.println("Invoking No arg Constructor of NylonRope");
	}
	
	public NylonRope(String type,float price,int size,double length) {
		super(type,price,size,length);
		System.out.println("Invoking arg Constructor of NylonRope");
	}
	
	

}
