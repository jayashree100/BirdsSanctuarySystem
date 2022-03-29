package com.bridgelab.birdsanctuary;

class Parrot extends Bird implements Flyable {

	public Parrot() {
		super();
	}

	public Parrot(String id) {
		super();
		name = "parrot";
		color = Color.GREEN;
		this.id = id;
	}

	public void swim() {
		System.out.println("parrot Cant swim");
	}
}
