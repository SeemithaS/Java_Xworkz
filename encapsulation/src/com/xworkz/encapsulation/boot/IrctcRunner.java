package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Irctc;

public class IrctcRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in IRCTC:");
        Irctc user = new Irctc();

        System.out.println("Username: " + user.getUsername());
        user.setUsername("Seemitha");
        System.out.println("Username: " + user.getUsername());
        
        System.out.println("Email: " + user.getEmail());
        user.setEmail("seemitha@gmail.com");
        System.out.println("Email: " + user.getEmail());
        
        System.out.println("Full Name: " + user.getFullName());
        user.setFullName("Seemitha");
        System.out.println("Full Name: " + user.getFullName());
        
        System.out.println("Phone Number: " + user.getPhoneNumber());
        user.setPhoneNumber("8088170018");
        System.out.println("Phone Number: " + user.getPhoneNumber());
        
        System.out.println("Address: " + user.getAddress());
        user.setAddress("Udupi");
        System.out.println("Address: " + user.getAddress());
        
        System.out.println("Preferred Language: " + user.getPreferredLanguage());
        user.setPreferredLanguage("English");
        System.out.println("Preferred Language: " + user.getPreferredLanguage());
        
        System.out.println("Is Senior Citizen: " + user.isSeniorCitizen());
        user.setSeniorCitizen(false);
        System.out.println("Is Senior Citizen: " + user.isSeniorCitizen());
        
        System.out.println("Is Student: " + user.isStudent());
        user.setStudent(true);
        System.out.println("Is Student: " + user.isStudent());
        
        System.out.println("Has Children: " + user.isHasChildren());
        user.setHasChildren(false);
        System.out.println("Has Children: " + user.isHasChildren());
        
        System.out.println("Total Bookings: " + user.getTotalBookings());
        user.setTotalBookings(10);
        System.out.println("Total Bookings: " + user.getTotalBookings());
        
        System.out.println("Loyalty Points: " + user.getLoyaltyPoints());
        user.setLoyaltyPoints(250);
        System.out.println("Loyalty Points: " + user.getLoyaltyPoints());
        
        System.out.println("Wallet Balance:" + user.getWalletBalance());
        user.setWalletBalance(1500.50);
        System.out.println("Wallet Balance: " + user.getWalletBalance());
        
        System.out.println("Gender: " + user.getGender());
        user.setGender('F');
        System.out.println("Gender: " + user.getGender());
        
        System.out.println("Age: " + user.getAge());
        user.setAge(22);
        System.out.println("Age: " + user.getAge());

   
    }
}

