package com.bridgelab.birdsanctuary;

public class Ostrich extends Bird implements Swimmable {
	
	public Ostrich(String id) {
		name = "ostrich";
		this.id = id;
		color = Color.WHITE;
	}

	public void swim() {
		System.out.println("Ostrich Cant swim");
	}
	
	
}

