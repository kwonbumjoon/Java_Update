package ex03;
/* 문제
 * 매소드 : max
 * 매개변수 : int, int
 * 반환타입 : void
 * 두 정수 중 최대값 반환
 * */
public class Sample04_4 {
	public static void main(String[] args) {
		System.out.println("최대값 출력");
		max(5, 20);
		System.out.println("프로그램 종료!");
	}
	
	static void max(int n1, int n2) {
		int max = (n1 > n2) ? n1 : n2;
			System.out.println("최대값 : " + max);
	}
}
