package modal;

import behaviors.Speakable;
import behaviors.Walkable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Mammal extends Animal implements Walkable,Speakable{
    private SoundHelper soundHelper;

    public Mammal() {
        this.soundHelper = new SoundHelper(SoundEnums.DEFAULT);
    }

    public Mammal(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }

    public void callSound() {
    	soundHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }

}
