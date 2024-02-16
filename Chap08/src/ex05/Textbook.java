package ex05;

public class Textbook extends Book {
	public Textbook() {}
	public Textbook(String title, String author, int publishYear) {
		super(title, author, publishYear);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " : 학문 분야";
	}
}
