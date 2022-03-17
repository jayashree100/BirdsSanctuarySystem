package com.bridgelab.birdsanctuary;

import java.util.Objects;

abstract public class Bird {
	
	enum Color { RED, GREEN, WHITE, BLACK_WHITE, BLACK, CYAN_GREEN}
	
	String name;
	String id;
	Color color;
 
	@Override
	public String toString() {
		return "Bird [name=" + name + ", id=" + id + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}

	public void eat() {
		System.out.println(getClass().getSimpleName() + " eat");
	}

	public void fly() {
		System.out.println(getClass().getSimpleName() + " cant fly");

	}

}
