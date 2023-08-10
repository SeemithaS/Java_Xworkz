package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Uber;

public class UberRunner {
	
	public static void main(String[] args) {
        Uber uber = new Uber();

        System.out.println("Passenger Name: " + uber.getPassengerName());
        uber.setPassengerName("Seemitha");
        System.out.println("Passenger Name: " + uber.getPassengerName());
        
        System.out.println("Driver Name: " + uber.getDriverName());
        uber.setDriverName("Shri");
        System.out.println("Driver Name: " + uber.getDriverName());
        
        System.out.println("Pickup Location: " + uber.getPickupLocation());
        uber.setPickupLocation("Rajajinagar");
        System.out.println("Pickup Location: " + uber.getPickupLocation());
        
        System.out.println("Drop Location: " + uber.getDropLocation());
        uber.setDropLocation("vijaynagar");
        System.out.println("Drop Location: " + uber.getDropLocation());
        
        System.out.println("Car Model: " + uber.getCarModel());
        uber.setCarModel("Sedan");
        System.out.println("Car Model: " + uber.getCarModel());
        
        System.out.println("Car Number: " + uber.getCarNumber());
        uber.setCarNumber("MH1234");
        System.out.println("Car Number: " + uber.getCarNumber());
        
        System.out.println("Driver Contact: " + uber.getDriverContact());
        uber.setDriverContact("9876543210");
        System.out.println("Driver Contact: " + uber.getDriverContact());
        
        System.out.println("Ride Distance: " + uber.getRideDistance());
        uber.setRideDistance(15.5);
        System.out.println("Ride Distance: " + uber.getRideDistance());
        
        System.out.println("Ride Duration: " + uber.getRideDuration() + " min");
        uber.setRideDuration(30.0);
        System.out.println("Ride Duration: " + uber.getRideDuration() + " min");
        
        System.out.println("Ride Cost: " + uber.getRideCost());
        uber.setRideCost(250.0);
        System.out.println("Ride Cost: " + uber.getRideCost());
        
        System.out.println("Ride Completed: " + uber.isRideCompleted());
        uber.setRideCompleted(true);
        System.out.println("Ride Completed: " + uber.isRideCompleted());
        
        System.out.println("Driver Rated: " + uber.isDriverRated());
        uber.setDriverRated(true);
        System.out.println("Driver Rated: " + uber.isDriverRated());
        
        System.out.println("Payment Completed: " + uber.isPaymentCompleted());
        uber.setPaymentCompleted(true);
        System.out.println("Payment Completed: " + uber.isPaymentCompleted());
        
        System.out.println("Number of Passengers: " + uber.getNumberOfPassengers());
        uber.setNumberOfPassengers(3);
        System.out.println("Number of Passengers: " + uber.getNumberOfPassengers());


    }
}
