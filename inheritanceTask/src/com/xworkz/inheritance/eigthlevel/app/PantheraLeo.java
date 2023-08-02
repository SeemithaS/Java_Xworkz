package com.xworkz.inheritance.eigthlevel.app;

public class PantheraLeo extends Panthera{
	
	public String family="Panthera";
	public PantheraLeo() {
		System.out.println("Invoking no arg constructor in PantheraLeo");
		System.out.println("PantheraLeo name:"+lifeSpan);
	}
	
	public void sleep() {
		System.out.println("Invoking sleep in PantheraLeo");
	}
}
