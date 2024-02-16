package ex02;

public class Cat {
	private String breed;
	private String color;
	
	Cat(String s1, String s2) {
		breed = s1;
		color = s2;
	}
	
	Cat(){
		
	}
	
	// 맴버 변수 값을 대입 및 변경은
	// 생성자를 이용 또는 setter를 이용해서 변경이나 초기화한다.
	
	// 추가..setter, getter
	// setter는 변수값을 변경할 때 사용
	// getter는 변수값을 읽어올 때 사용
	void setBreed(String s) {
		breed = s;
	}
	void setColor(String c) {
		color = c;
	}
	
	
	void eat() {
		System.out.println("먹이를 먹다.");
		System.out.println("품종은 " + breed + "입니다.");
		System.out.println("색상은 " + color + "입니다.");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다.");
	}
	void meow() {
		System.out.println("야옹 하고 울다.");		
	}
	int age = 10;
}
