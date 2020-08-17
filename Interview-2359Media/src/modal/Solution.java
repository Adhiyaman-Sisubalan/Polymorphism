package modal;

import behaviors.Flyable;
import behaviors.Speakable;
import behaviors.Swimmable;
import behaviors.Walkable;
import enums.SoundEnums;
import helper.SoundHelper;


public class Solution {

	public static void main(String[] args) {
		
		int flyingAnimal = 0;
		int walkingAnimal=0;
		int speakingAnimal=0;
		int swimingAnimal=0;
		
		var bird = new Bird();
		bird.callSound();
		Animal [] animals = {new Bird(), new Fish(), new Butterfly(),new Duck(), new Parrot()};
		
		for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Flyable) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Speakable) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swimmable) {
                swimingAnimal += 1;
            }
        }
		System.out.println(flyingAnimal+","+ walkingAnimal+","+speakingAnimal+","+swimingAnimal);
	
		
	}
}
