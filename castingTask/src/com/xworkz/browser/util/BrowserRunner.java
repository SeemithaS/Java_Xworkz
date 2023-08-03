package com.xworkz.browser.util;

public class BrowserRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in BrowserRunner");
		
		//Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		OperaBrowser opearBrowser=new OperaBrowser();
		FireFox fireFox =new FireFox();
		MicrosoftEdge microsftEdge=new MicrosoftEdge();
		
		BrowserUtil.run(chromeBrowser);
		System.out.println("*****************");
		BrowserUtil.run(opearBrowser);
		System.out.println("*****************");
		BrowserUtil.run(microsftEdge);
		System.out.println("*****************");
		BrowserUtil.run(fireFox);

	}

}
