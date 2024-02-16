package ex04.copy;

public class Dog extends Animal {
	private String dogsound = "멍멍";
	
	public Dog() {}
	public void makeSound() {
		super.makeSound();
		System.out.println(this.dogsound);
	}
	
}
