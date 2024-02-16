package ex02;

public class 구구단01 {

	public static void main(String[] args) {

//		구구단(2~9)
//		for(int i=2; i<=9; i++)
//			for(int j=1; j<=9; j++)
//				System.out.println(i + "x" + j + " = " + i*j);
		
//		n x n 구구단.		
		for(int i=2; i<=9; i++)
			for(int j=1; j<=9; j++)
			{
				System.out.println(i + "x" + j + " = " + i*j);
				if(j == i)
					break;
			}

	}

}
