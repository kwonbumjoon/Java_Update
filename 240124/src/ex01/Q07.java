package ex01;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		/* 문제
		 * 숫자 맞추기 게임
		 * 1~100 사이의 값을 반복적으로 입력
		 * 컴퓨터가 생각한 값을 맞추면 게임이 끝남
		 * 사용자 입력 = 컴퓨터 값 -> 끝 -> 시행 횟수 출력*/
		
		int answer = (int)(Math.random()*100) +1; 
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요. : ");
			input = s.nextInt();
			
			if(answer > input)
				System.out.println("더 큰 수를 입력하세요.");
			else if(input < answer)
				System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 : " + count + "번 입니다.");
				break;
			}
		}while(true);
		
	}
}
