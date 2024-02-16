package ex01;

public class new07 {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		// 특정 문자열을 대체함. 위에서는 "자바" -> "JAVA"로 변경
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
