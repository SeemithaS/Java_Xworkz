package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.RedBus;

public class RedBusRunner {
	
	 public static void main(String[] args) {
		 System.out.println("Running main in RedBusRunner:");
	        RedBus redBus = new RedBus();

	        System.out.println("Passenger Name: " + redBus.getPassengerName());
	        redBus.setPassengerName("Seemitha");
	        System.out.println("Passenger Name: " + redBus.getPassengerName());
	        
	        System.out.println("Ticket Number: " + redBus.getTicketNumber());
	        redBus.setTicketNumber("RB123456");
	        System.out.println("Ticket Number: " + redBus.getTicketNumber());
	        
	        System.out.println("Source City: " + redBus.getSourceCity());
	        redBus.setSourceCity("Bangalore");
	        System.out.println("Source City: " + redBus.getSourceCity());
	        
	        System.out.println("Destination City: " + redBus.getDestinationCity());
	        redBus.setDestinationCity("Udupi");
	        System.out.println("Destination City: " + redBus.getDestinationCity());
	        
	        System.out.println("Departure Time: " + redBus.getDepartureTime());
	        redBus.setDepartureTime("10:00 AM");
	        System.out.println("Departure Time: " + redBus.getDepartureTime());
	        
	        System.out.println("Arrival Time: " + redBus.getArrivalTime());
	        redBus.setArrivalTime("5:00 PM");
	        System.out.println("Arrival Time: " + redBus.getArrivalTime());
	        
	        System.out.println("Bus Operator: " + redBus.getBusOperator());
	        redBus.setBusOperator("Sugama Travels");
	        System.out.println("Bus Operator: " + redBus.getBusOperator());
	        
	        System.out.println("Bus Type: " + redBus.getBusType());
	        redBus.setBusType("Semi-Sleeper");
	        System.out.println("Bus Type: " + redBus.getBusType());
	        
	        System.out.println("Total Seats: " + redBus.getTotalSeats());
	        redBus.setTotalSeats(40);
	        System.out.println("Total Seats: " + redBus.getTotalSeats());
	        
	        System.out.println("Seats Booked: " + redBus.getSeatsBooked());
	        redBus.setSeatsBooked(25);
	        System.out.println("Seats Booked: " + redBus.getSeatsBooked());
	        
	        System.out.println("Ticket Price:" + redBus.getTicketPrice());
	        redBus.setTicketPrice(1200.0);
	        System.out.println("Ticket Price:" + redBus.getTicketPrice());
	        
	        System.out.println("Is Sleeper: " + redBus.isSleeper());
	        redBus.setSleeper(true);
	        System.out.println("Is Sleeper: " + redBus.isSleeper());
	        
	        System.out.println("Is AC: " + redBus.isAc());
	        redBus.setAc(true);
	        System.out.println("Is AC: " + redBus.isAc());
	        
	        System.out.println("Has WiFi: " + redBus.isWifi());
	        redBus.setWifi(false);
	        System.out.println("Has WiFi: " + redBus.isWifi());

	        
	    }

}
