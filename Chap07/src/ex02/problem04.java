package ex02;

public class problem04 {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCar("현대", "그랜저", 2020, "흰색");
		car1.startEngine();
		car1.stopEngine();
		car1.displayCarDetails();
		System.out.println("---------------------------");

		car1.setMake("기아");
		car1.setModel("K9");
		car1.displayCarDetails();
		
	}
}
