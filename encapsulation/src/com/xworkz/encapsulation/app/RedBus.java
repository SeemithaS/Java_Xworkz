package com.xworkz.encapsulation.app;

public class RedBus {
	
	    private String passengerName;
	    private String ticketNumber;
	    private String sourceCity;
	    private String destinationCity;
	    private String departureTime;
	    private String arrivalTime;
	    private String busOperator;
	    private String busType;
	    private int totalSeats;
	    private int seatsBooked;
	    private double ticketPrice;
	    private boolean isSleeper;
	    private boolean isAc;
	    private boolean isWifi;

	    public String getPassengerName() {
	        return passengerName;
	    }

	    public void setPassengerName(String passengerName) {
	        this.passengerName = passengerName;
	    }

	    public String getTicketNumber() {
	        return ticketNumber;
	    }

	    public void setTicketNumber(String ticketNumber) {
	        this.ticketNumber = ticketNumber;
	    }

	    public String getSourceCity() {
	        return sourceCity;
	    }

	    public void setSourceCity(String sourceCity) {
	        this.sourceCity = sourceCity;
	    }

	    public String getDestinationCity() {
	        return destinationCity;
	    }

	    public void setDestinationCity(String destinationCity) {
	        this.destinationCity = destinationCity;
	    }

	    public String getDepartureTime() {
	        return departureTime;
	    }

	    public void setDepartureTime(String departureTime) {
	        this.departureTime = departureTime;
	    }

	    public String getArrivalTime() {
	        return arrivalTime;
	    }

	    public void setArrivalTime(String arrivalTime) {
	        this.arrivalTime = arrivalTime;
	    }

	    public String getBusOperator() {
	        return busOperator;
	    }

	    public void setBusOperator(String busOperator) {
	        this.busOperator = busOperator;
	    }

	    public String getBusType() {
	        return busType;
	    }

	    public void setBusType(String busType) {
	        this.busType = busType;
	    }

	    public int getTotalSeats() {
	        return totalSeats;
	    }

	    public void setTotalSeats(int totalSeats) {
	        this.totalSeats = totalSeats;
	    }

	    public int getSeatsBooked() {
	        return seatsBooked;
	    }

	    public void setSeatsBooked(int seatsBooked) {
	        this.seatsBooked = seatsBooked;
	    }

	    public double getTicketPrice() {
	        return ticketPrice;
	    }

	    public void setTicketPrice(double ticketPrice) {
	        this.ticketPrice = ticketPrice;
	    }

	    public boolean isSleeper() {
	        return isSleeper;
	    }

	    public void setSleeper(boolean sleeper) {
	        isSleeper = sleeper;
	    }

	    public boolean isAc() {
	        return isAc;
	    }

	    public void setAc(boolean ac) {
	        isAc = ac;
	    }

	    public boolean isWifi() {
	        return isWifi;
	    }

	    public void setWifi(boolean wifi) {
	        isWifi = wifi;
	    }
}


