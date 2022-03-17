package com.bridgelab.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wel come to BirdSantuary");

		Penguin penguin = new Penguin("pn101");
		Penguin penguin2 = new Penguin("pn101");
		Parrot parrot = new Parrot("p101");
		Ostrich ostrich = new Ostrich("o101");
		Duck duck = new Duck("d101");

		BirdRepository birdrepository = new BirdRepository();
        birdrepository.add(duck);
		birdrepository.add(ostrich);
		birdrepository.add(parrot);
		birdrepository.add(penguin);
		birdrepository.add(penguin2);

		UserInterface ui = new UserInterface();
		ui.print(birdrepository.getBirdList());
		System.out.println("---------------------------");
		ui.ptintflyable(birdrepository.getBirdList());

		birdrepository.remove(penguin);
		ui.print(birdrepository.getBirdList());

	}

}
