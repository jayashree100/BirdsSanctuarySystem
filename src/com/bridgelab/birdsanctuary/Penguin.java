package com.bridgelab.birdsanctuary;

public class Penguin extends Bird implements Flyable {

	public Penguin() {
		super();
	}

	public Penguin(String id) {
		name = "penguin";
		color = Color.BLACK_WHITE;
		this.id = id;
	}

	@Override
	public void fly() {
		System.out.println("Penguin Can not fly");
	}
}
