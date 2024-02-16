package ex01;

public class TvTest4 {
	public static void main(String args[]) {
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channalUp();
			System.out.println("tvArr["+i+"].channel="+tvArr[i].channel);
		}
		
	}
}
