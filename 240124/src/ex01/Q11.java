package ex01;

public class Q11 {
	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);
			money = money % coinUnit[i];
		}
		
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money = " + money);
//		int leftmoney = 0;
//		for(int i=0; i<coinUnit.length; i++) {
//			if(i==0)
//				leftmoney = (money / coinUnit[i]);
//			else {
//				leftmoney = (money % coinUnit[i-1]) / coinUnit[i];
//			}
//			System.out.println(coinUnit[i] + "원 : " + leftmoney);
//		}
		
			
	}
}
