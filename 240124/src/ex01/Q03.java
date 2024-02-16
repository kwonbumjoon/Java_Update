package ex01;

public class Q03 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch < 'z') ? (char)(ch+32) : ch;
		System.out.println("ch : " + ch);						// ch : A
		System.out.println("ch to lowerCase : " + lowerCase);	// ch to lowerCase : a

		
//		char ch = 'A';
//		char lowerCase = ((int)ch < 97) ? (char)(ch+32) : ch;
//		System.out.println("ch : " + ch);						// ch : A
//		System.out.println("ch to lowerCase : " + lowerCase);	// ch to lowerCase : a
	}
}
