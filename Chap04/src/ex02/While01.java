package ex02;

public class While01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while(i <= 10)
		{
			sum += i;
			i++;
		}
		System.out.println("while문 누적합 : " + sum);

	}

}
