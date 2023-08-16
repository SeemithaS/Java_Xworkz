package com.xworkz.objectTask.app;

public class Cave {
	
	private String name;
    private double temperature;
    private int altitude;
    private boolean hasWaterSource;
    private boolean hasStalactites;
    private int year;
    private boolean isExplored;
    private boolean isHabitable;
    private String mineralComposition;
    private String location;
    
    public Cave() {
		System.out.println("Invoking no arg constructor in Cave");
	}
	public Cave(String name, double temperature, int altitude, boolean hasWaterSource, boolean hasStalactites, int year, boolean isExplored, boolean isHabitable, String mineralComposition, String location) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.altitude = altitude;
		this.hasWaterSource = hasWaterSource;
		this.hasStalactites = hasStalactites;
		this.year = year;
		this.isExplored = isExplored;
		this.isHabitable = isHabitable;
		this.mineralComposition = mineralComposition;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name +"temperature: "+this.temperature +"Altitude: "+this.altitude +" Has Water source: "+this.hasWaterSource + "hasStalactites: "+this.hasStalactites +"Year: "+this.year +"isExplored: "+this.isExplored +"isHabitable: "+this.isHabitable+ "mineralComposition: "+this.mineralComposition +"Location: "+this.location;
	}
    
    
    

}
