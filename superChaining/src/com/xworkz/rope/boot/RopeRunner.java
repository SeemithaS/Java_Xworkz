package com.xworkz.rope.boot;

import com.xworkz.rope.app.NylonRope;

public class RopeRunner {

	public static void main(String[] args) {
    System.out.println("Runnin main in RopeRunner");
		
		NylonRope rope=new NylonRope();
		System.out.println("Rope type"+rope.type);
		System.out.println("Rope price"+rope.price);
		System.out.println("Rope Size"+rope.size);
		System.out.println("Rope Length"+rope.length);
		
		System.out.println("*************************");
		
		NylonRope rope1=new NylonRope("CottonRope",150,18,5.8);
		System.out.println("Rope Type"+rope1.type);
		System.out.println("Rope Price"+rope1.price);
		System.out.println("Rope Size"+rope1.size);
		System.out.println("Rope Length"+rope1.length);

	}

}
