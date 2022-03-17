package com.bridgelab.birdsanctuary;

public class Ostrich extends Bird {
	
	public Ostrich(String id) {
		name = "ostrich";
		this.id = id;
		color = Color.WHITE;
	}

	public Ostrich() {
        super();
	}

	void swim() {
		System.out.println("Cant swim");
	}
}
