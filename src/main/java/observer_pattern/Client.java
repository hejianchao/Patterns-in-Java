package observer_pattern;

public class Client {

	public static void main(String[] args) {
		HouseZhongjie zj = new HouseZhongjie();
		FangKe fk1 = new FangKe("小何");
		FangKe fk2 = new FangKe("小刘");

		zj.addObserver(fk1);
		zj.addObserver(fk2);

		zj.setChanged();
		zj.notifyObservers("房子降价了哦。。");
		System.out.println(zj.countObservers());
		System.out.println(zj.hasChanged());
		System.out.println("--------");
	}

}
