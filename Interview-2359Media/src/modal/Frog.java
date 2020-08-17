package modal;

import behaviors.Speakable;
import behaviors.Swimmable;
import behaviors.Walkable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Frog extends Animal implements Swimmable,Walkable,Speakable {

	SoundHelper soundHelper;

    public Frog() {
        soundHelper = new SoundHelper(SoundEnums.DEFAULT);
    }

    public Frog(SoundHelper soundHelper) {
        soundHelper = soundHelper;
    }

    public void callSound() {
        soundHelper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }

}
