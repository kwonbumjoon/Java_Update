package ex02;

import java.util.Scanner;

public class dowhile02 {

	public static void main(String[] args) {
		
		int input, answer, count;
		input = answer = count = 0;

		answer = (int)(Math.random() * 100 + 1); //1~100 중 난수
		
		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.print("1과 100사이의 정수를 입력하세요!! : ");
			input = sc.nextInt();
			count++;
			
			if(input > answer)
				System.out.println("더 작은 수 입력!!");
			else
				System.out.println("더 큰 수 입력!!");
			
		}while(input != answer);
		
		System.out.println(count + "회 " + input + " 맞추었습니다.");
	}

}
