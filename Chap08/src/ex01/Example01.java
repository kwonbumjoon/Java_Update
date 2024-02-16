package ex01;

public class Example01 {
	public static void main(String[] args) {
		BabyCat catObj = new BabyCat();
		
		System.out.println("품종 : " + catObj.breed);
		System.out.println("색상 : " + catObj.color);
		
		catObj.eat();
		catObj.meow();
	}
}
