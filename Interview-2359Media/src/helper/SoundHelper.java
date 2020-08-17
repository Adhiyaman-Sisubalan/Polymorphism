package helper;

import enums.SoundEnums;

public class SoundHelper {
    private SoundEnums soundEnums;

    public SoundHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
