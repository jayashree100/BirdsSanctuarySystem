package com.bridgelab.birdsanctuary;

public class Duck extends Bird implements Flyable {

	public Duck(String id) {
		super();
		name = "duck";
		color = Color.CYAN_GREEN;
		this.id = id;
	}
}
