package ex03;
/* 문제
 * 매서드명 : abs
 * 반환타입 : int
 * 매개변수 : int
 * 기능 : 주어진 값의 절대값을 반환한다.*/
public class Sample02 {
	public static void main(String[] args) {
		int num = abs(8);
		System.out.println("절댓값 : " + num);
		
	}
	
	static int abs(int a) {
		return (a > 0) ? a : -a;
	}

}
