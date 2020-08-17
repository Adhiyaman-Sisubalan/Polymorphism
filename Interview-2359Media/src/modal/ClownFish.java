package modal;

import utils.Constant;

public class ClownFish extends Fish {
	@Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeJoke() {
    	System.out.println(Constant.I_MAKE_JOKES);
    }
}
