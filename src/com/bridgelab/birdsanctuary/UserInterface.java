package com.bridgelab.birdsanctuary;

import java.util.List;
import java.util.Set;

public class UserInterface {
     
	public void print(Set birdList) {
		for (Object list : birdList) {
			System.out.println(list);
		}
	}

	public void ptintflyable(Set<Bird> birdSet) {
	    for (Bird bird: birdSet) {
	    	bird.fly();
	    	System.out.println(bird);
			
       
		}
	}

}
