package com.xworkz.elevator.app;

public class ElevatorRunner {
	
	public static void main(String[] args) {
		
		Elevator elevator=new Elevator();
		elevator.lift();
		elevator.lift("Steel",450000);
		
	}
}
