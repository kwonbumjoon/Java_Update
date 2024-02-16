package ex02;
/* 문제
 * 속석 : title(제목), author(저자), publisher(출판사), price(가격)
 * 기능 : displayBookInfo() : 도서의 모든 정보를 출력하는 메소드*/
public class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	Book(){
		this("제목없음", "저자없음", "출판사없음", 0);
	}
	Book(String t, String a, int pri){
		this(t, a, "출판사없음", pri);
	}
	
	Book(String t, String a, String pub, int pri){
		title = t;
		author = a;
		publisher = pub;
		price = pri;
	}
	void displayBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
	}

}
