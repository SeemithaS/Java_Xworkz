package com.xworkz.objectTask.app;

public class Kercheif {

	private String brand;
	private String material;
	private String color;
	private double length;
	private double width;
	private boolean patterned;
	private float price;
	
	public Kercheif() {
		System.out.println("Invoking main in Kerchief");
	}
	
	public Kercheif(String brand, String material, String color, double length, double width, boolean patterned,float price) {
		super();
		this.brand = brand;
		this.material = material;
		this.color = color;
		this.length = length;
		this.width = width;
		this.patterned = patterned;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Brand name: " +this.brand +" Material: "+this.material+ " Color: "+this.color +" length: "+this.length +" width: "+this.width+ " Patterned: "+this.patterned +" Price: " +this.price;
	}
	
	

}
