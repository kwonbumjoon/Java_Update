package ex01;

public class note09 {
	public static void main(String[] args) {
		int[] scores = new int[] {83,90,87};
//		int[] scores;
//		scores = new int[] {83,90,87};
//		둘 다 같은 의미(표현만 다른것)
		
		int sum1 = 0;
		for(int i=0; i<3; i++)
			sum1 += scores[i];
		System.out.println("총합 : " + sum1);
		
		printItem(scores);
	}
	
	public static void printItem(int[] scores) {
		for(int i=0; i<3; i++)
			System.out.println("score[" + i + "]: " + scores[i]);
	}

}
