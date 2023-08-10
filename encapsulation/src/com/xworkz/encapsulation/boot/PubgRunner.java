package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Pubg;

public class PubgRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running main in PubgRunner");
        Pubg pubg = new Pubg();

        System.out.println("Player Name: " + pubg.getPlayerName());
        pubg.setPlayerName("Ganesh");
        System.out.println("Player Name: " + pubg.getPlayerName());
        
        System.out.println("Player ID: " + pubg.getPlayerId());
        pubg.setPlayerId("PUBG027");
        System.out.println("Player ID: " + pubg.getPlayerId());
        
        System.out.println("Level: " + pubg.getLevel());
        pubg.setLevel(50);
        System.out.println("Level: " + pubg.getLevel());
        
        System.out.println("Total Matches Played: " + pubg.getTotalMatchesPlayed());
        pubg.setTotalMatchesPlayed(500);
        System.out.println("Total Matches Played: " + pubg.getTotalMatchesPlayed());
        
        System.out.println("Total Kills: " + pubg.getTotalKills());
        pubg.setTotalKills(750);
        System.out.println("Total Kills: " + pubg.getTotalKills());
        
        System.out.println("Total Wins: " + pubg.getTotalWins());
        pubg.setTotalWins(100);
        System.out.println("Total Wins: " + pubg.getTotalWins());
        
        System.out.println("Win Percentage: " + pubg.getWinPercentage());
        pubg.setWinPercentage(20.0);
        System.out.println("Win Percentage: " + pubg.getWinPercentage());
        
        System.out.println("Favorite Map: " + pubg.getFavoriteMap());
        pubg.setFavoriteMap("Erangel");
        System.out.println("Favorite Map: " + pubg.getFavoriteMap());
        
        System.out.println("Clan Name: " + pubg.getClanName());
        pubg.setClanName("WinnerSquad");
        System.out.println("Clan Name: " + pubg.getClanName());
        
        System.out.println("Premium Pass Holder: " + pubg.isPremiumPassHolder());
        pubg.setPremiumPassHolder(true);
        System.out.println("Premium Pass Holder: " + pubg.isPremiumPassHolder());
        
        System.out.println("Ban Status: " + pubg.isBanStatus());
        pubg.setBanStatus(false);
        System.out.println("Ban Status: " + pubg.isBanStatus());
        
        System.out.println("Region: " + pubg.getRegion());
        pubg.setRegion("Asia");
        System.out.println("Region: " + pubg.getRegion());
        
        System.out.println("Total Revives: " + pubg.getTotalRevives());
        pubg.setTotalRevives(200);
        System.out.println("Total Revives: " + pubg.getTotalRevives());
        
        System.out.println("Gender: " + pubg.getGender());
        pubg.setGender('M');
        System.out.println("Gender: " + pubg.getGender());

        
        
    }

}
