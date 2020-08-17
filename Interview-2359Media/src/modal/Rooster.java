package modal;

import enums.SoundEnums;
import helper.SoundHelper;

public class Rooster extends Chicken  {
	SoundHelper soundHelper;
	public Rooster() {
        this.soundHelper = new SoundHelper(SoundEnums.ROOSTER);
    }
	public void canFly() {
		super.canFly();
	}
	
	public void callSound() {
		
	}
}
