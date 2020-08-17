package modal;

import behaviors.BodyType;
import behaviors.Swimmable;
import utils.Constant;

public  class Fish extends Animal implements Swimmable,BodyType{

	public void canSwim() {
		System.out.println(Constant.I_AM_SWIMMING);
	}
	
	public String bodyColor() {
		return null;
	}
	
	public String bodySize() {
		return null;
	}

	
}
