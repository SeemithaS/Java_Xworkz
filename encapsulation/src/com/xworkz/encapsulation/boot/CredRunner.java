package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Cred;

public class CredRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Cred:");
		Cred cred = new Cred();

		System.out.println("Username: " + cred.getUsername());
		cred.setUsername("john_doe");
		System.out.println("Username: " + cred.getUsername());
		
		System.out.println("Email: " + cred.getEmail());
		cred.setEmail("john@example.com");
		System.out.println("Email: " + cred.getEmail());
		
		System.out.println("Full Name: " + cred.getFullName());
		cred.setFullName("John Doe");
		System.out.println("Full Name: " + cred.getFullName());
		
		System.out.println("Phone Number: " + cred.getPhoneNumber());
		cred.setPhoneNumber("123-456-7890");
		System.out.println("Phone Number: " + cred.getPhoneNumber());
		
		System.out.println("Address: " + cred.getAddress());
		cred.setAddress("123 Main St, City");
		System.out.println("Address: " + cred.getAddress());
		
		System.out.println("Occupation: " + cred.getOccupation());
		cred.setOccupation("Software Engineer");
		System.out.println("Occupation: " + cred.getOccupation());
		
		System.out.println("Is Verified: " + cred.isVerified());
		cred.setVerified(true);
		System.out.println("Is Verified: " + cred.isVerified());
		
		System.out.println("Is Premium: " + cred.isPremium());
		cred.setPremium(false);
		System.out.println("Is Premium: " + cred.isPremium());
		
		System.out.println("Total Logins: " + cred.getTotalLogins());
		cred.setTotalLogins(100);
		System.out.println("Total Logins: " + cred.getTotalLogins());
		
		System.out.println("Reward Points: " + cred.getRewardPoints());
		cred.setRewardPoints(500);
		System.out.println("Reward Points: " + cred.getRewardPoints());
		
		System.out.println("Account Balance:" + cred.getAccountBalance());
		cred.setAccountBalance(1000.75);
		System.out.println("Account Balance:" + cred.getAccountBalance());
		
		System.out.println("Gender: " + cred.getGender());
		cred.setGender('M');
		System.out.println("Gender: " + cred.getGender());
		
		System.out.println("Age: " + cred.getAge());
		cred.setAge(30);
		System.out.println("Age: " + cred.getAge());

	}

}
