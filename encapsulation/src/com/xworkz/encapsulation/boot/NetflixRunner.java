package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Netflix;

public class NetflixRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running main in NetflixRunner:");
        Netflix netflix = new Netflix();

        System.out.println("Account Holder Name: " + netflix.getAccountHolderName());
        netflix.setAccountHolderName("Seemitha");
        System.out.println("Account Holder Name: " + netflix.getAccountHolderName());
        
        System.out.println("Subscription Plan: " + netflix.getSubscriptionPlan());
        netflix.setSubscriptionPlan("Premium");
        System.out.println("Subscription Plan: " + netflix.getSubscriptionPlan());
        
        System.out.println("Payment Method: " + netflix.getPaymentMethod());
        netflix.setPaymentMethod("Credit Card");
        System.out.println("Payment Method: " + netflix.getPaymentMethod());
        
        System.out.println("Devices Allowed: " + netflix.getDevicesAllowed());
        netflix.setDevicesAllowed(4);
        System.out.println("Devices Allowed: " + netflix.getDevicesAllowed());
        
        System.out.println("Active: " + netflix.isActive());
        netflix.setActive(true);
        System.out.println("Active: " + netflix.isActive());
        
        System.out.println("Profile Picture URL: " + netflix.getProfilePictureUrl());
        netflix.setProfilePictureUrl("https://netflix.com/seemitha.jpg");
        System.out.println("Profile Picture URL: " + netflix.getProfilePictureUrl());
        
        System.out.println("Total Watched Hours: " + netflix.getTotalWatchedHours());
        netflix.setTotalWatchedHours(50);
        System.out.println("Total Watched Hours: " + netflix.getTotalWatchedHours());
        
        System.out.println("Premium: " + netflix.isPremium());
        netflix.setPremium(true);
        System.out.println("Premium: " + netflix.isPremium());
        
        System.out.println("Preferred Language: " + netflix.getPreferredLanguage());
        netflix.setPreferredLanguage("English");
        System.out.println("Preferred Language: " + netflix.getPreferredLanguage());
        
        System.out.println("Account Age (Months): " + netflix.getAccountAgeMonths());
        netflix.setAccountAgeMonths(12);
        System.out.println("Account Age (Months): " + netflix.getAccountAgeMonths());
        
        System.out.println("Monthly Payment:" + netflix.getMonthlyPayment());
        netflix.setMonthlyPayment(15);
        System.out.println("Monthly Payment: $" + netflix.getMonthlyPayment());
        
        System.out.println("Billing Address: " + netflix.getBillingAddress());
        netflix.setBillingAddress("Kokkarne,Udupi");
        System.out.println("Billing Address: " + netflix.getBillingAddress());
        
        System.out.println("Watchlist: " + netflix.getWatchlist());
        netflix.setWatchlist("Movie C, Show D");
        System.out.println("Watchlist: " + netflix.getWatchlist());
        
        System.out.println("Has Downloads: " + netflix.isHasDownloads());
        netflix.setHasDownloads(true);
        System.out.println("Has Downloads: " + netflix.isHasDownloads());
     
 
       
    }

}
