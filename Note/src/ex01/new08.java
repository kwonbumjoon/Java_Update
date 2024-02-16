package ex01;

public class new08 {
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		// substring() 문자열 잘라내기
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		// 0~6까지 문자열 출력
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		// 7부터 끝까지 출력
	}
}
