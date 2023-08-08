package com.xworkz.flex.app;

public class FlexRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in FlexRunner");
		
		Flex flex=new RollingFlex();
		flex.display();

	}

}
