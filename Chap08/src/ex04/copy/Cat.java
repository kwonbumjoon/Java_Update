package ex04.copy;

public class Cat extends Animal{
	private String catsound = "야옹";
	
	public Cat() {}
	public void makeSound() {
		super.makeSound();
		System.out.println(this.catsound);
	}
}
