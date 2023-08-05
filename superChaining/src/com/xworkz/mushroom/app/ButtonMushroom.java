package com.xworkz.mushroom.app;

public class ButtonMushroom extends Mushroom{
	
	public ButtonMushroom() {
		super("Button",70,1.0f,'M');
		System.out.println("Invoking no-arg constructor of ButtonMushroom");	
	}
	
	public ButtonMushroom(String type,int price,float quantity,char size) {
		
		super(type,price,quantity,size);
		System.out.println("Invoking arg constructor of ButtonMushroom");
		
	}

}
