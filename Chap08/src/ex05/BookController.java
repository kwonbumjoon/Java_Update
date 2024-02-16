package ex05;

public class BookController {
	public static void main(String[] args) {
		details(new Novel("자바", "신용권", 2023));
		details(new Textbook("리엑트", "관우", 2021));
		details(new Magazine("js", "조운", 2022));
		
	}
	
	public static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}

}
