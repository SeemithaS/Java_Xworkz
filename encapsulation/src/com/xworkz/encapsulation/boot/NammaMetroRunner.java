package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.NammaMetro;

public class NammaMetroRunner {
	
	public static void main(String[] args) {
		 System.out.println("Running main in NammaMetroRunner:");
        NammaMetro nammaMetro = new NammaMetro();

        System.out.println("Passenger Name: " + nammaMetro.getPassengerName());
        nammaMetro.setPassengerName("Seemitha");
        System.out.println("Passenger Name: " + nammaMetro.getPassengerName());
        
        System.out.println("From Station: " + nammaMetro.getStationFrom());
        nammaMetro.setStationFrom("Rajajinagar");
        System.out.println("From Station: " + nammaMetro.getStationFrom());
        
        System.out.println("To Station: " + nammaMetro.getStationTo());
        nammaMetro.setStationTo("Yalahanka");
        System.out.println("To Station: " + nammaMetro.getStationTo());
        
        System.out.println("Travel Date: " + nammaMetro.getTravelDate());
        nammaMetro.setTravelDate("20-06-2023");
        System.out.println("Travel Date: " + nammaMetro.getTravelDate());
        
        System.out.println("Travel Time: " + nammaMetro.getTravelTime());
        nammaMetro.setTravelTime("09:00 AM");
        System.out.println("Travel Time: " + nammaMetro.getTravelTime());
        
        System.out.println("Ticket Type: " + nammaMetro.getTicketType());
        nammaMetro.setTicketType("Single Journey");
        System.out.println("Ticket Type: " + nammaMetro.getTicketType());
        
        System.out.println("Metro Line: " + nammaMetro.getMetroLine());
        nammaMetro.setMetroLine("Blue Line");
        System.out.println("Metro Line: " + nammaMetro.getMetroLine());
        
        System.out.println("Ticket Price:" + nammaMetro.getTicketPrice());
        nammaMetro.setTicketPrice(25.0);
        System.out.println("Ticket Price:" + nammaMetro.getTicketPrice());
        
        System.out.println("Return Ticket: " + nammaMetro.isReturnTicket());
        nammaMetro.setReturnTicket(false);
        System.out.println("Return Ticket: " + nammaMetro.isReturnTicket());
        
        System.out.println("Senior Citizen: " + nammaMetro.isSeniorCitizen());
        nammaMetro.setSeniorCitizen(true);
        System.out.println("Senior Citizen: " + nammaMetro.isSeniorCitizen());
        
        System.out.println("Student: " + nammaMetro.isStudent());
        nammaMetro.setStudent(false);
        System.out.println("Student: " + nammaMetro.isStudent());
        
        System.out.println("Rush Hour: " + nammaMetro.isRushHour());
        nammaMetro.setRushHour(true);
        System.out.println("Rush Hour: " + nammaMetro.isRushHour());
        
        System.out.println("Number of Passengers: " + nammaMetro.getNumberOfPassengers());
        nammaMetro.setNumberOfPassengers(1);
        System.out.println("Number of Passengers: " + nammaMetro.getNumberOfPassengers());

     
    }

}
