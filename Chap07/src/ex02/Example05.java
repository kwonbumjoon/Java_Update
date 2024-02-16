package ex02;

public class Example05 {
	public static void main(String[] args) {
		// 생성자를 통해 값을 초기화함.
		Cat c1 = new Cat("페르시안", "흰색");
		c1.eat();
		
		Cat c2 = new Cat("샴", "검정");
		c2.eat();
		
		c2.setBreed("러시안블루");
		c2.eat();
	}
}
