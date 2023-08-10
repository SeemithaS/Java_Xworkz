package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.YouTube;

public class YouTubeRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in YouTubeRunner ");
		YouTube channel = new YouTube();

		System.out.println(channel.getDevelopCompany());
		channel.setDevelopCompany("sAN BRUNO");
		System.out.println("company: " + channel.getDevelopCompany());

		System.out.println("Started year" + channel.getStartedYear());
		channel.setStartedYear(2005);
		System.out.println("Started year" + channel.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+channel.getLatestVersion());
		channel.setLatestVersion(25.20f);
		System.out.println("Snapchat Latest Version"+channel.getLatestVersion());
		
		System.out.println("Channel Name: " + channel.getChannelName());
		channel.setChannelName("TechExplorers");
		System.out.println("Channel Name: " + channel.getChannelName());
		
		System.out.println("Username: " + channel.getUsername());
		channel.setUsername("techexplorers");
		System.out.println("Username: " + channel.getUsername());
		
		System.out.println("Email: " + channel.getEmail());
		channel.setEmail("contact@techexplorers.com");
		System.out.println("Email: " + channel.getEmail());
		
		System.out.println("Subscribers Count: " + channel.getSubscribersCount());
		channel.setSubscribersCount(50000);
		System.out.println("Subscribers Count: " + channel.getSubscribersCount());
		
		System.out.println("Videos Uploaded: " + channel.getVideosUploaded());
		channel.setVideosUploaded(100);
		System.out.println("Videos Uploaded: " + channel.getVideosUploaded());
		
		System.out.println("Views Count: " + channel.getViewsCount());
		channel.setViewsCount(1000000);
		System.out.println("Views Count: " + channel.getViewsCount());
		
		System.out.println("Country: " + channel.getCountry());
		channel.setCountry("India");
		System.out.println("Country: " + channel.getCountry());
		
		System.out.println("Website: " + channel.getWebsite());
		channel.setWebsite("https://www.techexplorers.com");
		System.out.println("Website: " + channel.getWebsite());
		
		System.out.println("Verified: " + channel.isVerified());
		channel.setVerified(true);
		System.out.println("Verified: " + channel.isVerified());
		
		System.out.println("About: " + channel.getAbout());
		channel.setAbout("TechExplorers is a channel dedicated to showcasing the coolest tech innovations and gadgets.");
		System.out.println("About: " + channel.getAbout());
		
		System.out.println("Join Date: " + channel.getJoinDate());
		channel.setJoinDate("January 1, 2022");
		System.out.println("Join Date: " + channel.getJoinDate());

	}

}
