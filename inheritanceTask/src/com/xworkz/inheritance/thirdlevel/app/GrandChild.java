package com.xworkz.inheritance.thirdlevel.app;

public class GrandChild extends Child{
	
	public String place="Udupi";
	
	public GrandChild() {
		System.out.println("invoking no arg construtor");
		System.out.println("Place:"+place);
	}
	
	public void run() {
		System.out.println("invoking run in GrandChild");
	}

}
