package ex12;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}

class Unboxer {
	// extends Number => Number거나 Number를 상속한 대상이면 OK
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {

		Box<Integer> ibox = new Box<>();
		ibox.set(1234);
		Unboxer.peekBox(ibox);

		Box<Double> dbox = new Box<>();
		dbox.set(12.5);
		Unboxer.peekBox(dbox);
	}
}
