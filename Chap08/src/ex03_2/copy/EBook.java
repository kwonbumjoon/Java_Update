package ex03_2.copy;
// 자식 클래스
public class EBook extends Book{
//	 추가 속성 :
//	 fileSize(파일 크기, 실수 타입, MB 단위)
//	 format(파일 형식, 문자열 타입, 예:"PDF", "EPUB")
//	 메서드 : 
//	생성자: Book 클래스의 속성과 EBook 클래스의 속성 모두를 초기화합니다.
//	오버라이드된 displayInfo(): Book의 정보를 출력하고, 
//	추가로 "File Size: [fileSize] MB, Format: [format]"를 출력합니다.

	private double fileSize;
	private String format;
	public EBook() {}
	
	public EBook(String title, String author, int publicationYear, double filesize, String format) {
		super(title, author, publicationYear);	// 상위 클래스 생성자 호출
		this.fileSize = filesize;
		this.format = format;
	}
	
}
