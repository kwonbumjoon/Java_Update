
public class Example01 {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 5/a;	// 0으로 나누면 예외 발생
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눕니다.");
		}
		System.out.println("try-catch문의 외부 문장입니다.");
	}
	
}
