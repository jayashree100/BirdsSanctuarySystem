package com.bridgelab.birdsanctuary;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
	// private List birdList = new ArrayList();
	private Set<Bird> birdSet = new HashSet();

	private static BirdRepository instance;

	private BirdRepository() {

	}

	static synchronized BirdRepository getInstance() {
		if (instance == null) {
			instance = new BirdRepository();
		}
		return instance;
	}

	public Set getBirdList() {
		return birdSet;
	}

	public Bird getBird(String id) {
		for (Bird bird : birdSet) {
			if (bird.id.equals(id))
				System.out.println(bird.name);
			return bird;
		}
		return null;
	}

	void add(Bird bird) {
		birdSet.add(bird);
	}

	void remove(Bird bird) {
		birdSet.remove(bird);
		System.out.println("removed successfully");
	}

}
