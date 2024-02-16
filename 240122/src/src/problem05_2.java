package src;

import java.util.Scanner;

public class problem05_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0, use = 0;
		boolean quit = false;
		while(!quit) 
		{
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch(num)
			{
			case 1:
				System.out.print("예금액> ");
				total = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				use = sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + (total - use));
				break;
			case 4:
				System.out.print("프로그램 종료.");
				quit = true;
				break;
			}
		}

	}

}
