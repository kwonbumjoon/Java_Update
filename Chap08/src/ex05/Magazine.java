package ex05;

public class Magazine extends Book {
	public Magazine() {}
	public Magazine(String title, String author, int publishYear) {
		super(title, author, publishYear);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " : 발행 주기";
	}
}
