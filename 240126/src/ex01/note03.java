package ex01;

import java.util.Scanner;

public class note03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("=========================");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("=========================");
			System.out.print("선택: ");
			
			String strNum = s.nextLine();
			// switch 문을 사용할 수도 있음
			if(strNum.equals("1")) {	// (strNum == 1) 인식을 못함
				speed++;
				System.out.println("\r현재 속도 = " + speed);
			}
			else if(strNum.equals("2")) {
				speed--;
				System.out.println("\r현재 속도 = " + speed);				
			}
			else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료!");
	}
}
