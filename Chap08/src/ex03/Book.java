package ex03;
// 부모 클래스
public class Book {
	private String title;	// 책 제목
	private String author;	// 저자
	private int publicationYear;	// 출판 연도
	
	public Book() {	}
	
	// 메서드 : displayInfo()
	// 생성자 : 모든 속성을 초기화합니다.
	// displayInfo() : 책의 정보를 ""Title: [title], 
	// Author: [author], Year: [publicationYear]" 형태로 출력합니다.
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public void displayInfo() {
		System.out.print("Title: [" + title + "], ");
		System.out.print("Author: [" + author + "], ");
		System.out.println("Year: [" + publicationYear + "]");		
	}
}
