package ex02;

public class BasicArray00 {

	public static void main(String[] args) {
		
		int sum;
		
		int[] arrNum = new int[5];
				
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;
		
		for(int i=0; i<5; i++)
			System.out.print(arrNum[i] + " ");
		System.out.println("\r===============");
		
		int[] arrNum2 = {10, 20, 30, 40, 50};
		for(int i=0; i<arrNum2.length; i++)
			System.out.print(arrNum2[i] + " ");

	}

}
