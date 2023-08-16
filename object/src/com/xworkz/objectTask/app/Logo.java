package com.xworkz.objectTask.app;

public class Logo {
	
	private String name;
    private String color;
    private int width;
    private int height;
    private String slogan;
    
    public Logo() {
    	System.out.println("Invoking no arg constructor Logo");
    }
    
	public Logo(String name, String color, int width, int height, String slogan) {
		super();
		this.name = name;
		this.color = color;
		this.width = width;
		this.height = height;
		this.slogan = slogan;
	}
	
	@Override
	public String toString() {
		return "Logo name: "+this.name + " Logo color: "+this.color +" width: "+this.width+ " Height: "+this.height+ " slogan: "+this.slogan;
}

}
