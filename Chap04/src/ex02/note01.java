package ex02;

import java.util.Scanner;

public class note01 {

	public static void main(String[] args) {
		
		/* 문제
		 * 1. 숫자 입력 받기
		 * 2. 이 숫자가 3의 배수이면서 5의 배수이면 "좋아요" 아니면 "싫어요" 출력 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요. : ");
//		int num = sc.nextInt();
//		
//		if((num%3 == 0) & (num%5 == 0))
//			System.out.println("좋아요.");
//		else
//			System.out.println("싫어요.");
		
		/* 문제 
		 * 두 정수 입력 받아서 5, 10
		 * 큰 값, 작은 값으로 출력 */
		
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요. : ");
//		int num1 = s.nextInt();
//		System.out.print("숫자를 입력하세요. : ");
//		int num2 = s.nextInt();
//		
//		if(num1 < num2) 
//		{
//			System.out.println("큰 값은 : " + num2);
//			System.out.println("작은 값은 : " + num1);
//		}
//		else if(num1 > num2)
//		{
//			System.out.println("큰 값은 : " + num1);
//			System.out.println("작은 값은 : " + num2);
//		}
//		else
//			System.out.println("둘 다 같습니다.");
		
		/* 문제
		 * 세 정수 입력받아서 최대값 구하기*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		System.out.print("숫자를 입력하세요. : ");
		int num3 = sc.nextInt();
			
		
		if(num1 > num2 && num1 > num3)
			System.out.println("최대값은 : " + num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("최대값은 : " + num2);
		else if(num3 > num1 && num3 > num2)
			System.out.println("최대값은 : " + num3);
		
		
	}

}
