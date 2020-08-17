package modal;

import behaviors.Flyable;
import behaviors.Speakable;
import behaviors.Swimmable;
import behaviors.Walkable;
import enums.SoundEnums;
import helper.SoundHelper;

public class Solution {

	public static void main(String[] args) {
		
		var bird = new Bird();
		bird.callSound();
		
	}
}
