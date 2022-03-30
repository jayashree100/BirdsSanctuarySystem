package com.bridgelab.birdsanctuary;

import java.util.Set;

import com.bridgelab.birdsanctuary.Bird.Color;

import java.util.Scanner;

public class Main {
	static final int MAINEXIT = 5;
	// static UserInterface userinterface = new UserInterface();
	BirdRepository birdrepository = BirdRepository.getInstance();
	Scanner scanner = new Scanner(System.in);

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
			String birdId = scanner.next();
			Bird bird = birdrepository.getBird(birdId);
			System.out.println("Enter the option");
			int option2 = userinterface.showUpdateMenu();
			handleUpdateUserSelection(option2, bird);

			// Bird bird3 = birdrepository.getBird(bird.id);

			// System.out.println("Enter the bird id you want to update");
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

	public void handleUpdateUserSelection(int option2, Bird bird) {

		switch (option2) {
		case 1:
			System.out.println("Enter the Bird Id");
			String newId = scanner.next();
			bird.id = newId;
			break;
		case 2:
			System.out.println("Enter the Bird Name");
			String birdName = scanner.next();
			birdName.equalsIgnoreCase(birdName);
			bird.name = birdName;
			break;
		case 3:
			//System.out.println("Enter the color");
			//String color1 = scanner.next();
			//Color color = Color.valueOf(color1);
			//bird.color = color;
			setColor(bird);

			break;
		default:
			System.out.println("choose proper option");
		}
	}

	private void setColor(Bird bird) {
		//System.out.println("Enter: \n1 : RED \n2:GREEN  \n3: BLACK_WHITE ");
		//System.out.println("Enter the color");
		// Color color = Color.valueOf(scanner.next().toUpperCase());
		// Color color1 = Color.values()[scanner.nextInt()];
		int option = showColorMenu();
		Bird.Color[] colorValues = Bird.Color.values();
		bird.color = colorValues[option-1];
		

	}

	private int showColorMenu() {
		System.out.println("1.GRAY");
		System.out.println("2.BLUE");
        System.out.println("3.GREEN");
        System.out.println("4.BLACK");
        System.out.println("5.WHITE");
        System.out.println("Enter the options");
        int option = scanner.nextInt();
		return option;
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
