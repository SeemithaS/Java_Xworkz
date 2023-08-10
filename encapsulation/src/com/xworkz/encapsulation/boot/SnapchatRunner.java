package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Snapchat;

public class SnapchatRunner {
	
	public static void main(String[] args) {
        Snapchat snapchatProfile = new Snapchat();
        
        System.out.println(snapchatProfile.getDevelopCompany());
        snapchatProfile.setDevelopCompany("Snap");
		System.out.println("company: " + snapchatProfile.getDevelopCompany());

		System.out.println("Started year" + snapchatProfile.getStartedYear());
		snapchatProfile.setStartedYear(2011);
		System.out.println("Started year" + snapchatProfile.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+snapchatProfile.getLatestVersion());
		snapchatProfile.setLatestVersion(12.40f);
		System.out.println("Snapchat Latest Version"+snapchatProfile.getLatestVersion());
		
		System.out.println("Username: " + snapchatProfile.getUsername());
        snapchatProfile.setUsername("Seemitha");
        System.out.println("Username: " + snapchatProfile.getUsername());
        
        System.out.println("Friends Count: " + snapchatProfile.getFriendsCount());
        snapchatProfile.setFriendsCount(300);
        System.out.println("Friends Count: " + snapchatProfile.getFriendsCount());
        
        System.out.println("Snaps Sent: " + snapchatProfile.getSnapsSent());
        snapchatProfile.setSnapsSent(500);
        System.out.println("Snaps Sent: " + snapchatProfile.getSnapsSent());
        
        System.out.println("Verified Account: " + snapchatProfile.isVerified());
        snapchatProfile.setVerified(true);
        System.out.println("Verified Account: " + snapchatProfile.isVerified());
        
        System.out.println("Snap Score: " + snapchatProfile.getSnapScore());
        snapchatProfile.setSnapScore(1234.56);
        System.out.println("Snap Score: " + snapchatProfile.getSnapScore());
        
        System.out.println("Registration Date: " + snapchatProfile.getRegistrationDate());
        snapchatProfile.setRegistrationDate(23-07-2020);
        System.out.println("Registration Date: " + snapchatProfile.getRegistrationDate());
        
        System.out.println("Bio: " + snapchatProfile.getBio());
        snapchatProfile.setBio("Snapchat lover");
        System.out.println("Bio: " + snapchatProfile.getBio());
        
        System.out.println("Email: " + snapchatProfile.getEmail());
        snapchatProfile.setEmail("seemitha@example.com");
        System.out.println("Email: " + snapchatProfile.getEmail());
        
        System.out.println("Age: " + snapchatProfile.getAge());
        snapchatProfile.setAge(22);
        System.out.println("Age: " + snapchatProfile.getAge());
        
        System.out.println("Gender: " + snapchatProfile.getGender());
        snapchatProfile.setGender("Female");
        System.out.println("Gender: " + snapchatProfile.getGender());
        
        System.out.println("Location: " + snapchatProfile.getLocation());
        snapchatProfile.setLocation("Udupi");
        System.out.println("Location: " + snapchatProfile.getLocation());
        

        
       
    }


}
