package ex03;

public class Sample06_BasicArray01 {

	public static void main(String[] args) {

		/* 문제
		 * 1.int형 배열 생성 후 랜덤(1~100)이용해서 배열 크기 10 값 지정
		 * 2.그 배열의 총점, 평균 구하기*/
		
		double avg;
		int total = 0;
		
		int[] arrNum = new int[5];
		
		// 1~100의 값을 랜덤하게 추출해서 저장
		for(int i=0; i<arrNum.length; i++)
		{
			int num = (int)(Math.random()*100) + 1;
			arrNum[i] = num;
		}
		
		// 배열 10개 값 출력
		for(int i=0; i<arrNum.length; i++)
		{
			System.out.print(arrNum[i] + " ");
		}
		
		System.out.println();
		System.out.println("==============================");
		
		// 배열 총점, 평균 구하기
		for(int i=0; i<arrNum.length; i++)
			total += arrNum[i];
		
		System.out.println("총점 : " + total + ", 평균 : " +(double)total/arrNum.length);
		System.out.println("==============================");
	
		// 최댓값 구하기
		int max = 0;
		for(int i=0; i<arrNum.length; i++)
		{
			if(arrNum[i] > max)
				max = arrNum[i];
		}
		System.out.println("최댓값 : " + max);
		System.out.println("==============================");

		
		// 정렬
		
		for(int i=0; i<arrNum.length; i++) {
			for(int j=i+1; j<arrNum.length; j++) {
				int tmp;
				if(arrNum[i] > arrNum[j]) {
					tmp =  arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = tmp;
				}
			}
		}
		
		// 배열 10개값 출력
		System.out.println("Bubble Sort");
		for(int i=0; i<arrNum.length; i++)
			System.out.print(arrNum[i] + " ");
	
	}

}
