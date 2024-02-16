package ex01;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {

//		int num = 10;
//		
//		if(num > 15)
//		{
//			System.out.println("숫자가 15보다 큽니다.");
//		}
//		
//		System.out.println("이 문장은 if문 외부에 있습니다.");

		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력해주세요. : " );
		int age = input.nextInt();
		
		if(age >= 20)
			System.out.println("성인입니다.");		
		else
			System.out.println("미성년자입니다.");
		
		System.out.println("프로그램 종료.");
	}

}
