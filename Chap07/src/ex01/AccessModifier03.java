package ex01;

public class AccessModifier03 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		
		obj.bowwow();
		
		obj.age = 10;
		System.out.println("강아지 나이 : " + obj.age);
		obj.run();
		
		// 사용 불가(private으로 정의 되어있기 때문)
//		obj.name = "다운";
//		System.out.println("강아지 이름 : " + obj.name);
//		obj.sleep();
		
		// 스태틱 메소드는 객체 생산하지 않고 바로 접근 가능
		// 클래스명.메소드명으로 호출가능
		Dog.staticShow();	// 주로 이걸 사용
		obj.staticShow();	// 사용 자제..
	}
}
