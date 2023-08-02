package com.xworkz.inheritance.fifthlevel.app;

public class Wood extends Tree {
	
	public String type="SoftWood";
	
	public Wood() {
		System.out.println("Invoking no arg constructor in Wood");
		System.out.println("Wood type:"+type);
	}
	
	public void cutWood() {
		System.out.println("Invoking cutWood in Wood");
	}

}
