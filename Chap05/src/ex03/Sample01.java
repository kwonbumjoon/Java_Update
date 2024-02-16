package ex03;

public class Sample01 {
	public static void main(String[] args) {
		System.out.println("Hello~~~~~~~~~~~~!");
		
		int num1 = max(100, 20);
		System.out.println("최댓값 : " + num1);

		int num2 = min(100, 20);
		System.out.println("최소값 : " + num2);

	}
	
	// 매개변수 정수형 2개를 입력받아서, 정수값을 반환
	static int max(int n1, int n2) {
		System.out.println("난 MAX 함수!!");
		return n1>n2 ? n1 : n2;
	}
	
	static int min(int n1, int n2) {
		System.out.println("난 MIN 함수!!");
		return n1<n2 ? n1 : n2;
	}
}
