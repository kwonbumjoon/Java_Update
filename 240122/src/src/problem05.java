package src;

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		/* 문제
		 * while 문과 Scanner의 nextLine() 메소드를 이용하여 다음 실행 결과와 같이
		 * 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하시오.*/

		int bankBalance = 0;
		int tmp;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		for(;flag == true;) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) 
			{
				case 1:
					System.out.print("예금액> ");
					tmp = Integer.parseInt(sc.nextLine());
					bankBalance += tmp;
					break;
				case 2:
					System.out.print("출금액> ");
					tmp = Integer.parseInt(sc.nextLine());
					bankBalance -= tmp;
					break;
				case 3:
					System.out.println("잔고> " + bankBalance);
					break;
				default:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램 종료.");
		
	}

}
