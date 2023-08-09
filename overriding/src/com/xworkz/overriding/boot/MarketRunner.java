package com.xworkz.overriding.boot;

import com.xworkz.overriding.app.Market;
import com.xworkz.overriding.app.StreetMarket;

public class MarketRunner {

	public static void main(String[] args) {
    System.out.println("Running main in MarketRunner");
		
		Market market=new StreetMarket();
		market.shop();
		market.shop("Commercial Street");
		market.shop("Commercial Street", "Chickpete");
		market.shop("Commercial Street", "Chickpete", "Street Market");
		market.shop(680);
		market.shop("Commercial Street", 680);
		
		System.out.println("****************************");
		
		Market market1=new StreetMarket();
		market1.shop();
		market1.shop("Commercial Street");
		market1.shop("Commercial Street", "Chickpete");
		market1.shop("Commercial Street", "Chickpete", "Street Market");
		market1.shop(680);
		market1.shop("Commercial Street", 680);

	}

}
