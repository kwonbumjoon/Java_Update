package ex03;

public class BookController {
	public static void main(String[] args) {
		EBook eb = new EBook("스프링워크", "구멍가게", 2023, 10.2, "pdf");
		eb.displayInfo();
		
		AudioBook ab = new AudioBook("스프링워크", "코딩단", 2023, 3, "조운");
		ab.displayInfo();
	}
}
