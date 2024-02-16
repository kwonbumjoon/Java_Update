package problem;

import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {

		/* 문제 10
		 * 키보드로 입력받아 합계와 평균 구하기
		 * 숫자1 : 20
		 * 숫자2 : 30
		 * 합계 : 50
		 * 평균 : 25.0 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자1을 입력하세요. : ");
		int num1 = input.nextInt();
		System.out.print("숫자2를 입력하세요 : ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		float avg = sum / 2;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
