package ex05;

public class Example {
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C) {	// a가 참조하는 대상이 C인지 아닌지 분별
			// a(참조변수)가 참조하는 대상이 C클래스이거나 C클래스를 상속한 클래스이면 참
			// Java 12버전 이상일경우 if(a instanceof C c)만 사용 가능
			C c = new C();		
			c.method2();
		}
	}

}
