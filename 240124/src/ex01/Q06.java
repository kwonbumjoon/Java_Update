package ex01;

public class Q06 {
	public static void main(String[] args) {
		/* 문제 
		 * 두 개의 주사위를 던졌을 때, 
		 * 눈의 합이 6이 되는 모든 경우의 수 출력*/
		//1-5 2-4 3-3 4-2 5-1

		int i, j, count=0;
		for(i=1; i<=6; i++) {
			for(j=1; j<=6; j++) {
				if((i + j) == 6) {
					count++;
					System.out.println(i + " + " + j + " = " + (i+j));					
				}
			}			
		}
		System.out.println("두 눈의 합이 6이 되는 갯수 : " + count + "개");
			
	}
}
