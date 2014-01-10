package observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class FangKe implements Observer {
	private String name;

	public FangKe() {
	}

	public FangKe(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name:" + name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("name=" + name + " 听说房子价格有变化了哦，关注下：" + arg + "-->o:" + o);
	}

}
