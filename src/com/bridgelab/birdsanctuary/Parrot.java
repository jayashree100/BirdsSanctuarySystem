package com.bridgelab.birdsanctuary;

class Parrot extends Bird {

	public Parrot() {
		super();
	}

	public Parrot(String id) {
		super();
		name = "parrot";
		color = Color.GREEN;
		this.id = id;
	}

	void swim() {
		System.out.println("Cant swim");
	}
}
