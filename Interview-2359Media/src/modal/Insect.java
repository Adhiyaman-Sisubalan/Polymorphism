package modal;

import behaviors.Flyable;
import behaviors.Speakable;
import behaviors.Walkable;
import helper.SoundHelper;
import utils.Constant;

public class Insect extends Animal implements Walkable,Flyable,Speakable {

	 private SoundHelper soundHelper;

	    public Insect(SoundHelper soundHelper) {
	        this.soundHelper = soundHelper;
	    }
	@Override
	public void callSound() {
		soundHelper.makeSound();
	}

	@Override
	public void canFly() {
		System.out.println(Constant.I_AM_FLYING);
	}

	@Override
	public void canWalk() {
		 System.out.println(Constant.I_AM_WALKING);
	}

}
