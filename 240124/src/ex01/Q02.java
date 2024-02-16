package ex01;

public class Q02 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) ||(ch >= 97 && ch <= 122);
		System.out.println(b);	// true
		
	}
}
