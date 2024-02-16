package ex03;
/* 문제
 * 매소드 : max
 * 매개변수 : int, int
 * 반환타입 : int
 * 두 정수 중 최대값 반환
 * */
public class Sample04_1 {
	public static void main(String[] args) {
		System.out.println("최대값 출력");
		int max = max(5, 20);
		System.out.println("최대값 : " + max);
		System.out.println("프로그램 종료!");
	}
	
	static int max(int num1, int num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
}
