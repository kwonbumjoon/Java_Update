package src;

public class problem03 {

	public static void main(String[] args) {

		/* 문제
		 * 1~100 사이에 홀수합과 짝수합을 구하시오!*/

		int odd = 0, even = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		}
		
		System.out.println("홀수의 합 : " + odd + "\r짝수의 합 : " + even);
		
	}

}
