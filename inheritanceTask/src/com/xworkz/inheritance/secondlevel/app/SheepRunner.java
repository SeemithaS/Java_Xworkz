package com.xworkz.inheritance.secondlevel.app;

public class SheepRunner {

	public static void main(String[] args) {
		System.out.println("Running main in SheepRunner");
		
		Hat hat=new Hat();
		hat.eat();
		hat.makeCloth();
		hat.wear();
	}

}
