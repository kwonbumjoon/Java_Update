package ex03;
/* 문제
 * 매소드 : max
 * 매개변수 : 없음
 * 반환타입 : void
 * 두 정수 중 최대값 반환
 * */
public class Sample04_3 {
	public static void main(String[] args) {
		System.out.println("최대값 출력");
		max();
		System.out.println("프로그램 종료!");
	}
	
	static void max() {
		int num1 = 5;
		int num2 = 20;
		int max = (num1 > num2) ? num1 : num2;
			System.out.println("최대값 : " + max);
	}
}
