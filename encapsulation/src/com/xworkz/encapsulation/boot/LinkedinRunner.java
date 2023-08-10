package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Linkedin;

public class LinkedinRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running main in LinkedinRunner ");
        Linkedin linkdein = new Linkedin();
        
        System.out.println("Full Name: " + linkdein.getFullName());
        linkdein.setFullName("Seemitha");
        System.out.println("Full Name: " + linkdein.getFullName());
        
        System.out.println("Headline: " + linkdein.getHeadline());
        linkdein.setHeadline("Computer Science Student");
        System.out.println("Headline: " + linkdein.getHeadline());
        
        System.out.println("Country: " + linkdein.getCountry());
        linkdein.setCountry("Karnataka");
        System.out.println("Country: " + linkdein.getCountry());
       
        System.out.println("University: " + linkdein.getUniversity());
        linkdein.setUniversity("VTU");
        System.out.println("University: " + linkdein.getUniversity());
        
        System.out.println("Connections: " + linkdein.getConnections());
        linkdein.setConnections(200);
        System.out.println("Connections: " + linkdein.getConnections());
        
        System.out.println("Email: " + linkdein.getEmail());
        linkdein.setEmail("seemitha@gmail.com");
        System.out.println("Email: " + linkdein.getEmail());
        
        System.out.println("Phone Number: " + linkdein.getPhoneNumber());
        linkdein.setPhoneNumber("+1 123-456-7890");
        System.out.println("Phone Number: " + linkdein.getPhoneNumber());
       
        System.out.println("Premium Member: " + linkdein.isPremiumMember());
        linkdein.setPremiumMember(false);
        System.out.println("Premium Member: " + linkdein.isPremiumMember());
        
        System.out.println("Profile Picture URL: " + linkdein.getProfilePictureUrl());
        linkdein.setProfilePictureUrl("https://likedin.com/seemitha.jpg");
        System.out.println("Profile Picture URL: " + linkdein.getProfilePictureUrl());
        
        System.out.println("Website: " + linkdein.getWebsite());
        linkdein.setWebsite("https://www.lenkedin.com/seemitha2002");
        System.out.println("Website: " + linkdein.getWebsite());
        
        System.out.println("Languages: " + linkdein.getLanguages());
        linkdein.setLanguages("English");
        System.out.println("Languages: " + linkdein.getLanguages());
        
        System.out.println("Projects: " + linkdein.getProjects());
        linkdein.setProjects("e_commerece website for farmers");
        System.out.println("Projects: " + linkdein.getProjects());
        
        System.out.println("Courses: " + linkdein.getCourses());
        linkdein.setCourses("Core Java, Web Development");
        System.out.println("Courses: " + linkdein.getCourses());
       
       
    }

}
