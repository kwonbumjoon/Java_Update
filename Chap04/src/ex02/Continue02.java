package ex02;

public class Continue02 {

	public static void main(String[] args) {

		/* 문제
		 * 1~10사이의 홀수의 합*/
		int sum = 0;
		for(int i=1; i<=10; i++) 
		{
			if(i%2!=0)
				sum += i;
		}
		System.out.println("1부터 10사이의 홀수의 합 : " + sum);
		System.out.println("=======================");
		
		int sum2 = 0;
		for(int i=1; i<=10; i++) 
		{
			if(i%2==0)
				continue;
				sum2 += i;
		}
		System.out.println("1부터 10사이의 홀수의 합 : " + sum2);
		
		
		
	}

}
