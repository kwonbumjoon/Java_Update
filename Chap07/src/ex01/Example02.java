package ex01;

public class Example02 {
	public static void main(String[] args) {
		myMethod1();
		
		Example02 myObj = new Example02();
		myObj.myMethod2();;
	}
	
	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
}
