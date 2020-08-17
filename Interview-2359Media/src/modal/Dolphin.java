package modal;



import behaviors.Swimmable;
import utils.Constant;

public class Dolphin extends Animal implements Swimmable{

	@Override
	public void canSwim() {
		System.out.println(Constant.I_AM_SWIMMING);
		
	}

}
