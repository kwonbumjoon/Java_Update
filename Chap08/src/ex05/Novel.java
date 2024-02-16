package ex05;

public class Novel extends Book {
	public Novel() {}
	public Novel(String title, String author, int publishYear) {
		super(title, author, publishYear);
	}
	@Override
	public String getDetails() {
		return super.getDetails() + " : 장르";
	}

	
}
