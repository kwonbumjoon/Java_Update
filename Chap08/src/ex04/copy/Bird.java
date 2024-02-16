package ex04.copy;

public class Bird extends Animal {
	private String birdsound = "짹짹";
	
	public Bird() {}
	public void makeSound() {
		super.makeSound();
		System.out.println(this.birdsound);
	}
}
