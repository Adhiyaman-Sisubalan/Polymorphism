package modal;


import behaviors.Flyable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Parrot extends Bird implements Flyable {
	
	public Parrot() {
        super(new SoundHelper(SoundEnums.DEFAULT));
    }
	
	public Parrot(SoundHelper soundHelper) {
        super(soundHelper);
    }
	
	public void canFly() {
		 System.out.println(Constant.I_AM_FLYING);
	}
}
