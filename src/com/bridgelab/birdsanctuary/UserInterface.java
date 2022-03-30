package com.bridgelab.birdsanctuary;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	  
	private UserInterface(){
		
	}
	static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void print(Set birdList) {
		for (Object list : birdList) {
			System.out.println(list);
		}
	}

	public void ptintflyable(Set<Bird> birdSet) {
		for (Bird bird : birdSet) {
			if (bird instanceof Flyable)
				((Flyable) bird).fly();
		}
	}

	public void ptintswimmAble(Set<Bird> birdSet) {
		for (Bird bird : birdSet) {
			if (bird instanceof Swimmable)
				((Swimmable) bird).swim();
			// Swimmable swimbird = (Swimmable)bird;
			// swimbird.swim();
		}
	}

	public int showMainMenu() {
		System.out.println("1.add");
		System.out.println("2.remove");
		System.out.println("3.update");
		System.out.println("4.print");
		System.out.println(Main.MAINEXIT + " EXit ");
		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();
		return option;
	}
	public int showUpdateMenu() {
		System.out.println("Enter :\n1: id \n2: color \n3:name");
		Scanner scanner = new Scanner(System.in);
		int option2 = scanner.nextInt();
		return option2;
	}
	
}
