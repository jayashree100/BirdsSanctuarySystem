package com.bridgelab.birdsanctuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdRepository {
	//private List birdList = new ArrayList();
      private Set<Bird> birdSet = new HashSet();
	public Set getBirdList() {
		return birdSet;
	}

	void add(Bird bird) {
		birdSet.add(bird);
	}
	
	void remove(Bird bird) {
		birdSet.remove(bird);
	}
	

}
