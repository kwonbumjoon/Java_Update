package ex04;

public class Dog extends Animal {
	
	public Dog() {}
	public void makeSound() {
		super.makeSound();
		System.out.println("멍멍");
	}
	
}
