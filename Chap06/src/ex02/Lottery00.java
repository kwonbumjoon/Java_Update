package ex02;

public class Lottery00 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		boolean flag = false;
		
		for(int j=0; j<5; j++)
		{
			for(int i=0; i<lotto.length; i++)
			{
				flag = false;
				int num = (int)(Math.random()*45) +1;
				
				for(int k=0; k<i; k++)
				{
					if(num == lotto[k])
					{
						flag = true;
						break;
					}
				}
				if(flag)
				{
					i--;
					continue;
				}
				lotto[i] = num;
			}
			
			for(int i=0; i<lotto.length; i++)
				System.out.print(lotto[i] + " ");
			System.out.println("\r=================");
		}
		
	}

}
