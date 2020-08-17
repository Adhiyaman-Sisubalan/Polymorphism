package modal;

import behaviors.NotFlyable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Chicken extends Bird implements NotFlyable{
	
	public Chicken() {
        super(new SoundHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SoundHelper soundHelper) {
        super(soundHelper);
    }

	public void canFly() {
		System.out.println(Constant.I_CANT_FLY);
	}
	
	public void canWalk() {
		super.canWalk();
	}
}
