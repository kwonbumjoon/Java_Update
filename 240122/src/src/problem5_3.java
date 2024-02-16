package src;

import java.util.Scanner;

public class problem5_3 {
	public static void main(String[] args) {
		
		
		int totalMoney = 0;
		int use = 0;
		boolean flag = true;
		
		Scanner s = new Scanner(System.in);

		for(;flag == true;)
		{
			System.out.println("==============================");
			System.out.println("1.예금 |\t2.출금 |\t3.잔고 |\t4.종료");
			System.out.println("==============================");
			System.out.print("선택 >> ");
			int num = Integer.parseInt(s.nextLine());
			
			switch(num)
			{
			case 1:
				System.out.print("예금액 >> ");
				totalMoney = Integer.parseInt(s.nextLine());
				break;
			case 2:
				System.out.print("출금액 >> ");
				use = Integer.parseInt(s.nextLine());
				totalMoney -= use;
				break;
			case 3:
				System.out.println("잔고 >> " + totalMoney);
				break;
			default:
				flag = false;
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
}

// 아래의 방법보단 위에 것이 더 사용하기 좋음
//public class problem5_3 {
//	public static void main(String[] args) {
//		
//		
//		int totalMoney = 0;
//		int use = 0;
//		boolean flag = true;
//		
//		Scanner s = new Scanner(System.in);
//		
//		for(;flag == true;)
//		{
//			System.out.println("==============================");
//			System.out.println("1.예금 |\t2.출금 |\t3.잔고 |\t4.종료");
//			System.out.println("==============================");
//			System.out.print("선택 >> ");
//			String num = s.nextLine();
//			
//			switch(num)
//			{
//			case "1":
//				System.out.print("예금액 >> ");
//				totalMoney = Integer.parseInt(s.nextLine());
//				break;
//			case "2":
//				System.out.print("출금액 >> ");
//				use = Integer.parseInt(s.nextLine());
//				totalMoney -= use;
//				break;
//			case "3":
//				System.out.println("잔고 >> " + totalMoney);
//				break;
//			default:
//				flag = false;
//				break;
//			}
//		}
//		System.out.println("프로그램 종료.");
//	}
//}