package src;

public class problem04 {

	public static void main(String[] args) {

		/* 문제
		 * 1~100 사이에 
		 * 3의 배수이면서 5의 배수 합 구하고, 갯수 구하기 */
		
		int sum = 0, num = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				sum += i;
				num++;
			}
		}
		System.out.println("합 : " + sum + "\r갯수 : " + num + "개");

	}

}
