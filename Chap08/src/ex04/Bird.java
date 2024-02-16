package ex04;

public class Bird extends Animal {
	
	public Bird() {}
	public void makeSound() {
		super.makeSound();
		System.out.println("짹짹");
	}
}
