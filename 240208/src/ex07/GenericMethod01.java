package ex07;

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
	// 제네릭 메소드 
	// <T> : 제네릭 메소드 표시
	// Box<T> : 반환타입, makeBox : 함수명, (T o) : 매개변수
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {
//		Box<String> sBox = BoxFactory.<String>makeBox("korea");
		Box<String> sBox = BoxFactory.makeBox("korea");
		System.out.println(sBox.get());
		
		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
	}
}
