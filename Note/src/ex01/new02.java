package ex01;

public class new02 {

	public static void main(String[] args) {
		//NullPointerException
//		int[] intArray = null;
//		intArray[0] = 10;
//		
//		String str = null;
//		System.out.println("총 문자수 : " + str.length());
		
		String hobby = "여행";
		hobby = null;		// "여행"에 해당하는 String 객체를 쓰레기로 만듦
		System.out.println("hobby: " + hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;	// kind1 변수에 저장되 있는 번지를 kind2 변수에 대입
		kind1 = null;			// "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2: " + kind2);
		
	}

}
