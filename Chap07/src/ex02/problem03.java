package ex02;

public class problem03 {
	public static void main(String[] args) {
		Book b1 = new Book("JAVA 기본", "송미영", 30000);
		
		b1.displayBookInfo();
		System.out.println("--------------------------");
		
		Book b2 = new Book();
		b2.displayBookInfo();
		System.out.println("--------------------------");
		
		Book b3 = new Book("자바의 정석", "남궁성", "몰라", 10000);
		b3.displayBookInfo();
	}
}
