package com.bridgelab.birdsanctuary;

import java.util.Set;
import java.util.Scanner;

public class Main {
	static final int MAINEXIT = 5;
	// static UserInterface userinterface = new UserInterface();
	BirdRepository birdrepository = BirdRepository.getInstance();

	public void addBird() {
		// TODO Bird creation
		Bird penguin = new Penguin("pn101");
		Bird penguin2 = new Penguin("pn101");
		Bird parrot = new Parrot("p101");
		Bird ostrich = new Ostrich("o101");
		Bird duck = new Duck("d101");

		BirdRepository birdrepository = BirdRepository.getInstance();
		birdrepository.add(duck);
		birdrepository.add(ostrich);
		birdrepository.add(parrot);
		birdrepository.add(penguin);
		birdrepository.add(penguin2);
		System.out.println("birds added");

	}

	public void handleUserSelection(int option) {
		Scanner scanner = new Scanner(System.in);
		BirdRepository birerepository = BirdRepository.getInstance();
		UserInterface userinterface = UserInterface.getInstance();

		switch (option) {
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Enter the Bird id you want to remove");
			String id = scanner.next();
			Bird removingbird = birdrepository.getBird(id);
			birdrepository.remove(removingbird);
			break;
		case 3:
			System.out.println("Enter the Bird Id you want to Edit");
			String id2 = scanner.next();
			Bird bird = birdrepository.getBird(id2);
			userinterface.showUpdateMenu();
			int option2 = userinterface.showUpdateMenu();
			handleUpdateUserSelection(option2);
            break;
		case 4:
			userinterface.print(birdrepository.getBirdList());

			break;
		case MAINEXIT:
			System.out.println("TaTa Bye Bye");
		default:
			System.out.println("Choose proper option");

		}

	}

	public void handleUpdateUserSelection(int option) {

	}

	public static void main(String[] args) {
		System.out.println("Wel come to BirdSantuary");
		int option;

		BirdRepository birdrepository = BirdRepository.getInstance();

		Main main = new Main();
		UserInterface userinterface = UserInterface.getInstance();

		do {
			option = userinterface.showMainMenu();
			main.handleUserSelection(option);
		} while (option != MAINEXIT);

		/*
		 * Bird penguin = new Penguin("pn101"); Bird penguin2 = new Penguin("pn101");
		 * Bird parrot = new Parrot("p101"); Bird ostrich = new Ostrich("o101"); Bird
		 * duck = new Duck("d101");
		 * 
		 * BirdRepository birdrepository = new BirdRepository();
		 * birdrepository.add(duck); birdrepository.add(ostrich);
		 * birdrepository.add(parrot); birdrepository.add(penguin);
		 * birdrepository.add(penguin2);
		 * 
		 * UserInterface ui = new UserInterface();
		 * ui.print(birdrepository.getBirdList());
		 * ui.ptintflyable(birdrepository.getBirdList());
		 * 
		 * birdrepository.remove(penguin); ui.print(birdrepository.getBirdList());
		 * 
		 * ui.ptintswimmAble(birdrepository.getBirdList());
		 */

	}
}
