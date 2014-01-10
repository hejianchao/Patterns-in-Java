package observer_pattern;

import java.util.Observable;

public class HouseZhongjie extends Observable{
	
	public HouseZhongjie() {
	}
	
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}
}
