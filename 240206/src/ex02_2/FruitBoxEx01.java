package ex02_2;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과, 오랜지만 담고싶은데.. 다른것이 담겨도 제어 불가
 * 2. get할 때 형변환 해야한다.(다운케스팅을 해야한다.)
 * */

public class FruitBoxEx01{
	public static void main(String[] args) {
		Box abox = new Box();
		Box bbox = new Box();
		
		abox.setObj(new Apple());	// 사과 담음
		bbox.setObj(new Orange());	// 오랜지 담음
		
		Apple ap = (Apple)abox.getObj();		// 형 변환
		Orange op = (Orange)bbox.getObj();	
		
		System.out.println(ap);
		System.out.println(op);
		
		abox.setObj(10);
		abox.setObj("hello");
	}
}

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an Orange.";
	}
}

class Box {
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	Object getObj() {
		return obj;
	}
}


