package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Ola;

public class OlaRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running main in OlaRunner");
        Ola ola = new Ola();
        

        System.out.println("Passenger Name: " + ola.getPassengerName());
        ola.setPassengerName("Seemitha");
        System.out.println("Passenger Name: " + ola.getPassengerName());
        
        System.out.println("Driver Name: " + ola.getDriverName());
        ola.setDriverName("Shri");
        System.out.println("Driver Name: " + ola.getDriverName());
        
        System.out.println("Pickup Location: " + ola.getPickupLocation());
        ola.setPickupLocation("Rajajinagar");
        System.out.println("Pickup Location: " + ola.getPickupLocation());
        
        System.out.println("Drop Location: " + ola.getDropLocation());
        ola.setDropLocation("jayanagar");
        System.out.println("Drop Location: " + ola.getDropLocation());
        
        System.out.println("Car Model: " + ola.getCarModel());
        ola.setCarModel("Sedan");
        System.out.println("Car Model: " + ola.getCarModel());
        
        System.out.println("Car Number: " + ola.getCarNumber());
        ola.setCarNumber("MH1234");
        System.out.println("Car Number: " + ola.getCarNumber());
        
        System.out.println("Driver Contact: " + ola.getDriverContact());
        ola.setDriverContact("9876543210");
        System.out.println("Driver Contact: " + ola.getDriverContact());
        
        System.out.println("Ride Distance: " + ola.getRideDistance());
        ola.setRideDistance(15.5);
        System.out.println("Ride Distance: " + ola.getRideDistance());
        
        System.out.println("Ride Duration: " + ola.getRideDuration());
        ola.setRideDuration(30.0);
        System.out.println("Ride Duration: " + ola.getRideDuration());
        
        System.out.println("Ride Cost" + ola.getRideCost());
        ola.setRideCost(250.0);
        System.out.println("Ride Cost: " + ola.getRideCost());
        
        System.out.println("Ride Completed: " + ola.isRideCompleted());
        ola.setRideCompleted(true);
        System.out.println("Ride Completed: " + ola.isRideCompleted());
        
        System.out.println("Driver Rated: " + ola.isDriverRated());
        ola.setDriverRated(true);
        System.out.println("Driver Rated: " + ola.isDriverRated());
        
        System.out.println("Payment Completed: " + ola.isPaymentCompleted());
        ola.setPaymentCompleted(true);
        System.out.println("Payment Completed: " + ola.isPaymentCompleted());
        
        System.out.println("Number of Passengers: " + ola.getNumberOfPassengers());
        ola.setNumberOfPassengers(1);
        System.out.println("Number of Passengers: " + ola.getNumberOfPassengers());

    }

}
