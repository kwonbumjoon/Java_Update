package ex01;
/* 문제
 * for문을 사용하여 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력.*/
public class note04 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0)
				sum += i;
		}
		System.out.println("1부터 100까지 정수 중 3의 배수의 총합 : " + sum);
	}
}
	