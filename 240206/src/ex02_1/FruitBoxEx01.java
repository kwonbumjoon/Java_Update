package ex02_1;

/*
 * 이 코드 문제점(?)
 * 1. AppleBox, OrangeBox 거의 비슷
 * 2. 한박스에 사과, 오랜지 담고 싶다.
 * */

public class FruitBoxEx01{
	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());
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

class AppleBox {
	private Apple ap;
	
	void setAp(Apple ap) {
		this.ap = ap;
	}
	Apple getAp() {
		return ap;
	}
}

class OrangeBox {
	private Orange op;
	
	void setOp(Orange op) {
		this.op = op;
	}
	Orange getOp() {
		return op;
	}
}


