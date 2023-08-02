package com.xworkz.inheritance.forthlevel.app;

public class Tree extends Plant {
	
	public String type="Fruit Tree";
	
	public Tree() {
		System.out.println("Tree type:"+type);
	}
	
	public void giveOxygen(){
		System.out.println("Invoking giveOxygen in Tree");
	}
}
	