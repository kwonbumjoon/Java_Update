package src;
import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {

		/* 문제
		 * 가장 작은 정수값 3개 입력 
		 * 가장 작은 값 출력*/
		System.out.println("정수 3개를 입력하세요. : ");

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if(x > y)
		{
			if(y > z)
				System.out.println("최솟값은 : " + z);
			else
				System.out.println("최솟값은 : " + y);
		}
		else
		{
			if(x > z)
				System.out.println("최솟값은 : " + z);
			else
				System.out.println("최솟값은 : " + x);
		}
			
	}

}
