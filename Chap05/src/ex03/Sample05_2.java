package ex03;

import java.util.Scanner;

/* 문제
 * 매소드 : calculateEvenSum
 * 매개변수 : int
 * 반환타입 : int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하시오.
 * (아래 코드는 사용자의 입력을 받아서 실행하는 코드)
 * */
public class Sample05_2 {
	public static void main(String[] args) {
		// n = 5
		System.out.println("정수 N까지의 모든 짝수의 합 구하기!");
		System.out.print("정수 N을 입력하세요. : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = calculateEvenSum(num);
		System.out.println("정수 " + num + "까지 모든 짝수의 합 : " + result);
	}
	
	static int calculateEvenSum(int x) {
		int sum = 0;
		for(int i=1; i<=x; i++)
			if(i % 2 == 0)
				sum += i;
		
		return sum;
	}

}
