package ex02;

import java.util.Scanner;

public class Loop01_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		int num[] = new int[5];
		
		for(int n = 0; n < 5; n++)
		{
			Scanner s = new Scanner(System.in);
			num[n] = s.nextInt();
		}
		
		for(int i:num)
		{
			sum += i;
		}
		
		System.out.println("합계 : " + sum);


	}

}
