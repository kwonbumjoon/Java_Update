package ex01;

public class EqualEx01 {
	public static void main(String[] args) {
		String str1 = new String("Korea");
		String str2 = new String("Korea");
		
		System.out.println(str1 == str2);		// 주소값 비고
		
		System.out.println(str1.equals(str2));	// 참조 주소 인 값 비교
	}
}
