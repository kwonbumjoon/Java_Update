package ex07;

public class ComputerController {
	public static void main(String[] args) {
		Speaker sp = new Speaker4();
		
		sp.powerOn();
		sp.soundUp();
		sp.soundDown();
		sp.powerOff();
	}
}