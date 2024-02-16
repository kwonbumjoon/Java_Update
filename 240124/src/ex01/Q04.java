package ex01;

public class Q04 {
	public static void main(String[] args) {
		// 홀수 : + 
		// 짝수 : -
		// 조건 : 100이상의 값 출력
		int sum=0, num;
		for(num=1; num<num+1; num++) {
			
			if(num % 2 == 0)
				sum -= num;
			else
				sum += num;
			if(sum >= 100)
				break;
		}
		System.out.println(num + "까지 더해야 합니다.");
		
	}
}
