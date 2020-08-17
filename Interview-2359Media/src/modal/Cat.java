package modal;

import enums.SoundEnums;
import helper.SoundHelper;

public class Cat extends Mammal{

	public Cat() {
        super(new SoundHelper(SoundEnums.CAT));
    }

    public Cat(SoundHelper soundHelper) {
        super(soundHelper);
    }
}
