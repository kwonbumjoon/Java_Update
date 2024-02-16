package ex06_2;

public class ComputerController {
	public static void main(String[] args) {
		Speaker sp = new ChildSpeaker();
		
		sp.powerOn();
		sp.soundUp();
		sp.soundDown();
		sp.powerOff();
	}
}