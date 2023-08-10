package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Rapido;

public class RapidoRunner {

	public static void main(String[] args) {

		System.out.println("Running main  in Rapido");
		Rapido rapido = new Rapido();

		System.out.println("Passenger Name: " + rapido.getPassengerName());
		rapido.setPassengerName("Seemitha");
		System.out.println("Passenger Name: " + rapido.getPassengerName());

		System.out.println("Captain Name: " + rapido.getCaptainName());
		rapido.setCaptainName("Ravi");
		System.out.println("Captain Name: " + rapido.getCaptainName());

		System.out.println("Pickup Location: " + rapido.getPickupLocation());
		rapido.setPickupLocation("Rajajinagar");
		System.out.println("Pickup Location: " + rapido.getPickupLocation());

		System.out.println("Drop Location: " + rapido.getDropLocation());
		rapido.setDropLocation("MG road");
		System.out.println("Drop Location: " + rapido.getDropLocation());

		System.out.println("Bike Model: " + rapido.getBikeModel());
		rapido.setBikeModel("Scooter");
		System.out.println("Bike Model: " + rapido.getBikeModel());

		System.out.println("Bike Number: " + rapido.getBikeNumber());
		rapido.setBikeNumber("KA5678");
		System.out.println("Bike Number: " + rapido.getBikeNumber());

		System.out.println("Captain Contact: " + rapido.getCaptainContact());
		rapido.setCaptainContact("9876543210");
		System.out.println("Captain Contact: " + rapido.getCaptainContact());

		System.out.println("Ride Distance: " + rapido.getRideDistance());
		rapido.setRideDistance(10.5);
		System.out.println("Ride Distance: " + rapido.getRideDistance());

		System.out.println("Ride Duration: " + rapido.getRideDuration());
		rapido.setRideDuration(20.0);
		System.out.println("Ride Duration: " + rapido.getRideDuration());

		System.out.println("Ride Cost: " + rapido.getRideCost());
		rapido.setRideCost(150.0);
		System.out.println("Ride Cost: " + rapido.getRideCost());

		System.out.println("Ride Completed: " + rapido.isRideCompleted());
		rapido.setRideCompleted(true);
		System.out.println("Ride Completed: " + rapido.isRideCompleted());

		System.out.println("Captain Rated: " + rapido.isCaptainRated());
		rapido.setCaptainRated(true);
		System.out.println("Captain Rated: " + rapido.isCaptainRated());

		System.out.println("Payment Completed: " + rapido.isPaymentCompleted());
		rapido.setPaymentCompleted(true);
		System.out.println("Payment Completed: " + rapido.isPaymentCompleted());

		System.out.println("Number of Passengers: " + rapido.getNumberOfPassengers());
		rapido.setNumberOfPassengers(1);
		System.out.println("Number of Passengers: " + rapido.getNumberOfPassengers());

	}
}
