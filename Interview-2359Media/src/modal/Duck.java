package modal;


import enums.SoundEnums;
import helper.SoundHelper;
import behaviors.Flyable;
import behaviors.Swimmable;
import utils.Constant;

public class Duck extends Bird implements Swimmable, Flyable{
	
	 public Duck() {
	        super(new SoundHelper(SoundEnums.DUCK));
	    }

	    @Override
	    public void canWalk() {
	        super.canWalk();
	    }

	    public void canFly() {
	        System.out.println(Constant.I_AM_FLYING);
	    }

	    public void canSwim() {
	        System.out.println(Constant.I_AM_SWIMMING);
	    }

}
