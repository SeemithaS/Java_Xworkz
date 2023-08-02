package com.xworkz.inheritance.thirdlevel.app;

public class Child  extends Parent{
	
	public String job;
	
	public Child() {
		System.out.println("Invoking no arg const of Child");
		System.out.println("Job:"+job);
	}
	
	public void eat() {
		System.out.println("Invoking eat in child");
	}

}
