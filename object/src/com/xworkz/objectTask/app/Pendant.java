package com.xworkz.objectTask.app;

public class Pendant {

	private String brand;
	private double price;
	private String material;
	private String design;
	private String manfDate;
	private double weight;
	private int length;
	private int width;
	private String gemstone;
	private boolean isPrecious;
	private String color;
	private String chainType;
	private boolean hasChain;
	private int numDiamonds;
	private boolean isCustomized;
	
	public Pendant() {
		
	}
	public Pendant(String brand, double price, String material, String design, String manfDate, double weight,
			int length, int width, String gemstone, boolean isPrecious, String color, String chainType,
			boolean hasChain, int numDiamonds, boolean isCustomized) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.design = design;
		this.manfDate = manfDate;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.gemstone = gemstone;
		this.isPrecious = isPrecious;
		this.color = color;
		this.chainType = chainType;
		this.hasChain = hasChain;
		this.numDiamonds = numDiamonds;
		this.isCustomized = isCustomized;
	}
	
	@Override
	public String toString() {
		return "brand=" + brand + ", price=" + price + ", material=" + material + ", design=" + design
				+ ", manfDate=" + manfDate + ", weight=" + weight + ", length=" + length + ", width=" + width
				+ ", gemstone=" + gemstone + ", isPrecious=" + isPrecious + ", color=" + color + ", chainType="
				+ chainType + ", hasChain=" + hasChain + ", numDiamonds=" + numDiamonds + ", isCustomized="
				+ isCustomized ;
	}
	
	

}
