package com.xworkz.inheritance.eigthlevel.app;

public class Vertebrate extends Animal{
	
	public String name="Fish";
	
	public Vertebrate() {
		System.out.println("Invoking no arg constructor in Vertebrate");
		System.out.println("Vertebrate name:"+name);
	}
	
	public void eat() {
		System.out.println("Invoking eat in Vertebrate");
	}
	}

