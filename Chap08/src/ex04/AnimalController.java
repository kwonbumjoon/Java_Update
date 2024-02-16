package ex04;

public class AnimalController {
	public static void main(String[] args) {
		/* 다형성을 만족하지 않는다.
		Dog objdog = new Dog();
		objdog.makeSound();

		Cat objcat = new Cat();
		objcat.makeSound();
		
		Bird objbird = new Bird();
		objbird.makeSound();
		*/
		
		// 다형성을 사용한 표기
		sound(new Dog());
		sound(new Cat());
		sound(new Bird());
	}
	
	static void sound(Animal animal) {
		animal.makeSound();
	}
}
