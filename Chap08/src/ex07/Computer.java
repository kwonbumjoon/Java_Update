package ex07;

public class Computer {
	
	Speaker sp = new Speaker4();
	
	void powerOn() {
		sp.powerOn();
	}
	void powerOff() {
		sp.powerOff();
	}
	void volumeUp() {
		sp.soundUp();
	}
	void volumeDown() {
		sp.soundDown();
	}
	
}
