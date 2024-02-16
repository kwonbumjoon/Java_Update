package ex01;

public class Example03 {
	public static void main(String[] args) {
		Cat catObj = new Cat();
		// new Cat()은 Cat()란 생성자 호출을 통해서 객체를 생성한다.
		// 객체를 생성하였을시 Java컴파일러가 Cat()이라는 default 생성자를 만듬.
		
		System.out.println("페르시안 고양이");
		catObj.meow();
	}
}
