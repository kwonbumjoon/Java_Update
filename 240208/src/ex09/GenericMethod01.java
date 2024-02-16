package ex09;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);

		System.out.println("Boxed : " + o.intValue());
		return box;
	}
}

class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unboxed : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {
		Box<Integer> ibox = BoxFactory.makeBox(new Integer(100));
		int num = Unboxer.openBox(ibox);
		System.out.println("data : " + num);

	}
}
