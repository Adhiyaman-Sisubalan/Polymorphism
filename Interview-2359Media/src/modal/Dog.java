package modal;

import enums.SoundEnums;
import helper.SoundHelper;

public class Dog extends Mammal{

	 public Dog() {
	        super((new SoundHelper(SoundEnums.DOG)));
	    }

	    public Dog(SoundHelper soundHelper) {
	        super(soundHelper);
	    }
}
