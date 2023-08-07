package com.xworkz.hotel.app;

public class HotelRunner {
	

	public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		hotel.serve();
		hotel.serve("Royal Veg",18);
		
	}

}
