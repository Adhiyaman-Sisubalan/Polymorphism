package modal;

import behaviors.Flyable;
import behaviors.Speakable;
import behaviors.Walkable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Bird extends Animal implements Walkable, Speakable, Flyable{

	private SoundHelper soundHelper;

    public Bird() {
        this.soundHelper = new SoundHelper(SoundEnums.DEFAULT);
    }

    public Bird(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }
	public void canWalk() {
		System.out.println(Constant.I_AM_WALKING);
	    }
	
	public void callSound() {
		this.soundHelper.makeSound();
	}
	
	public void canFly() {
		System.out.println(Constant.I_AM_FLYING);
	}

}
