package ex02;

public class Method01 {

	public static void method() {
		System.out.println("static 매서드입니다.");
		System.out.println(5+6);
	}
	
	public static void main(String[] args) {
		System.out.println("첫 번째 호출 매서드입니다.");
		method();
		
		System.out.println("두 번째 호출 매서드입니다.");
		method();

	}

}
