package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.NammaYatri;

public class NammaYatriRunner {
	
	public static void main(String[] args) {
		 System.out.println("Running main in NammaYatriRunner:");
        NammaYatri nammaYatri = new NammaYatri();

        System.out.println("Passenger Name: " + nammaYatri.getPassengerName());
        nammaYatri.setPassengerName("Alice Johnson");
        System.out.println("Passenger Name: " + nammaYatri.getPassengerName());
        
        System.out.println("Source Location: " + nammaYatri.getSourceLocation());
        nammaYatri.setSourceLocation("Station A");
        System.out.println("Source Location: " + nammaYatri.getSourceLocation());
        
        System.out.println("Destination Location: " + nammaYatri.getDestinationLocation());
        nammaYatri.setDestinationLocation("Station B");
        System.out.println("Destination Location: " + nammaYatri.getDestinationLocation());
        
        System.out.println("Travel Date: " + nammaYatri.getTravelDate());
        nammaYatri.setTravelDate("2023-08-20");
        System.out.println("Travel Date: " + nammaYatri.getTravelDate());
        
        System.out.println("Travel Time: " + nammaYatri.getTravelTime());
        nammaYatri.setTravelTime("08:30 AM");
        System.out.println("Travel Time: " + nammaYatri.getTravelTime());
        
        System.out.println("Ticket Type: " + nammaYatri.getTicketType());
        nammaYatri.setTicketType("Single Journey");
        System.out.println("Ticket Type: " + nammaYatri.getTicketType());

        System.out.println("Coach Type: " + nammaYatri.getCoachType());
        nammaYatri.setCoachType("First Class");
        System.out.println("Coach Type: " + nammaYatri.getCoachType());
        
        System.out.println("Ticket Price:" + nammaYatri.getTicketPrice());
        nammaYatri.setTicketPrice(30.0);
        System.out.println("Ticket Price:" + nammaYatri.getTicketPrice());
        
        System.out.println("Return Ticket: " + nammaYatri.isReturnTicket());
        nammaYatri.setReturnTicket(false);
        System.out.println("Return Ticket: " + nammaYatri.isReturnTicket());
        
        System.out.println("Senior Citizen: " + nammaYatri.isSeniorCitizen());
        nammaYatri.setSeniorCitizen(true);
        System.out.println("Senior Citizen: " + nammaYatri.isSeniorCitizen());
        
        System.out.println("Student: " + nammaYatri.isStudent());
        nammaYatri.setStudent(false);
        System.out.println("Student: " + nammaYatri.isStudent());
        
        System.out.println("Has Luggage: " + nammaYatri.hasLuggage());
        nammaYatri.setHasLuggage(true);
        System.out.println("Has Luggage: " + nammaYatri.hasLuggage());
        
        System.out.println("Number of Passengers: " + nammaYatri.getNumberOfPassengers());
        nammaYatri.setNumberOfPassengers(1);
        System.out.println("Number of Passengers: " + nammaYatri.getNumberOfPassengers());

    }

}
