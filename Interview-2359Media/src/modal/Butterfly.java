package modal;

import behaviors.Flyable;
import behaviors.NotFlyable;
import behaviors.NotSpeakable;
import behaviors.Speakable;
import enums.SoundEnums;
import helper.SoundHelper;
import utils.Constant;

public class Butterfly extends Insect {
	private Insect state = new caterpillarState(new SoundHelper(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SoundHelper(SoundEnums.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SoundHelper(SoundEnums.NO_SOUND));
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {

        public ButterflyState(SoundHelper soundHelper) {
            super(soundHelper);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class caterpillarState extends Insect implements Speakable, NotFlyable {

        public caterpillarState(SoundHelper soundHelper) {
            super(soundHelper);

        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(Constant.I_CANT_FLY);
        }
    }
	
}
