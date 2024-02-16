package ex02;

public class Lottery {

	public static void main(String[] args) {

		/* 문자
		 * 1~45 숫자 중에서 랜덤하게 6개 추출.
		 * (주의! 추출한 숫자들 중 중복은 제거해야 함)*/
		
		int[] arr = new int[6];
		
		for(int i=0; i<5; i++) 
		{
			System.out.print(i+1 + " 번째 : "); // 순서(전체 뽑는 횟수)
			
			for(int j=0; j<arr.length; j++)
			{
				int rand = (int)(Math.random()*45 +1);
				arr[j] = rand;	// 랜덤 수를 배열에 대입
				
				for(int k=0; k<j; k++)
				{
					if(arr[j] == arr[k])
						i--;
				}
				System.out.print(arr[j] + " ");
			}
		System.out.println("");
			
		}
		
	}

}
