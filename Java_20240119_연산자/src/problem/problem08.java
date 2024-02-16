package problem;

import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		
		/* 문제 8
		 * 키보드로 문자열 입력받아 출력하기
		 * 문자열 입력 : JavaBook
		 * 출력 결과 : JavaBook */
		
		System.out.print("문자열 입력 : ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		System.out.println("출력 결과 : " + word);
		
		
	}

}
