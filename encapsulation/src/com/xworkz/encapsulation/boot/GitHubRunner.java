package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.GitHub;

public class GitHubRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in GitHubRunner");
        GitHub gitHubProfile = new GitHub();
        
        System.out.println(gitHubProfile.getDevelopCompany());
        gitHubProfile.setDevelopCompany("Microsoft");
		System.out.println("company: " + gitHubProfile.getDevelopCompany());

		System.out.println("Started year" + gitHubProfile.getStartedYear());
		gitHubProfile.setStartedYear(2009);
		System.out.println("Started year" + gitHubProfile.getStartedYear());
		
		System.out.println("Snapchat Latest Version"+gitHubProfile.getLatestVersion());
		gitHubProfile.setLatestVersion(25.20f);
		System.out.println("Snapchat Latest Version"+gitHubProfile.getLatestVersion());

		System.out.println("Username: " + gitHubProfile.getUsername());
        gitHubProfile.setUsername("SeemithaS");
        System.out.println("Username: " + gitHubProfile.getUsername());
        
        System.out.println("Repositories: " + gitHubProfile.getRepositories());
        gitHubProfile.setRepositories(20);
        System.out.println("Repositories: " + gitHubProfile.getRepositories());
        
        System.out.println("Followers: " + gitHubProfile.getFollowers());
        gitHubProfile.setFollowers(150);
        System.out.println("Followers: " + gitHubProfile.getFollowers());
        
        System.out.println("Following: " + gitHubProfile.getFollowing());
        gitHubProfile.setFollowing(100);
        System.out.println("Following: " + gitHubProfile.getFollowing());
        
        System.out.println("Verified Account: " + gitHubProfile.isVerified());
        gitHubProfile.setVerified(true);
        System.out.println("Verified Account: " + gitHubProfile.isVerified());
       
        System.out.println("Joined Date: " + gitHubProfile.getJoinedDate());
        gitHubProfile.setJoinedDate(20-05-2019);
        System.out.println("Joined Date: " + gitHubProfile.getJoinedDate());
        
        System.out.println("Bio: " + gitHubProfile.getBio());
        gitHubProfile.setBio("Fresher");
        System.out.println("Bio: " + gitHubProfile.getBio());
        
        System.out.println("Email: " + gitHubProfile.getEmail());
        gitHubProfile.setEmail("seemitha@gmail.com");
        System.out.println("Email: " + gitHubProfile.getEmail());
        
        System.out.println("Contributions: " + gitHubProfile.getContributions());
        gitHubProfile.setContributions(500);
        System.out.println("Contributions: " + gitHubProfile.getContributions());
        
        System.out.println("Website: " + gitHubProfile.getWebsite());
        gitHubProfile.setWebsite("https://github.com/SeemithaS");
        System.out.println("Website: " + gitHubProfile.getWebsite());
        
        System.out.println("Student: " + gitHubProfile.isStudent());
        gitHubProfile.setStudent(false);
        System.out.println("Student: " + gitHubProfile.isStudent());
       
    }

}
