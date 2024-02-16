package src;
import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {

		/* 문제
		 * 버스기본요금 1500원
		 * 0~3 : 할인율 100%
		 * 4~13 : 할인율 50%
		 * 14~19 : 할인율 25%
		 * 20세 이상 : 할인율 0% 
		 * 65세 이상 : 할인율 100%
		 * */
		
//		System.out.print("버스기본요금은 1500원입니다.\r나이를 입력하세요. : ");
//
//		Scanner s = new Scanner(System.in);
//		int age = s.nextInt();
//		int cost = 1500;
//		int charge = 0;
//		
//		if(age >= 0 && 4 > age)
//			charge = 0;
//		else if(age >= 4 && 14 > age)
//			charge = cost * 50/100;
//		else if(age >= 14 && 19 > age)
//			charge = cost * 75/100;
//		else if(age >= 20 && 64 > age)
//			charge = cost;
//		else if(age >= 65)
//			charge = 0;
//
//		System.out.println("요금은 : " + charge + "원 입니다.");
		
		
		System.out.print("버스기본요금은 1500원입니다.\r나이를 입력하세요. : ");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		double cost = 1500;
		double charge = 0;
		
		if(age >= 0 && 4 > age)
			charge = cost * 0.0;
		else if(age >= 4 && 14 > age)
			charge = cost * 0.5;
		else if(age >= 14 && 19 > age)
			charge = cost * 0.75;
		else if(age >= 20 && 64 > age)
			charge = cost * 1.0;
		else if(age >= 65)
			charge = cost * 0.0;

		System.out.println("요금은 : " + (int)charge + "원 입니다.");
	}

}
