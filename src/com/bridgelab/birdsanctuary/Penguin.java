package com.bridgelab.birdsanctuary;

public class Penguin extends Bird {

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
		System.out.println("Can not fly");

	}
}
