package ex06;

public class Computer {
	Speaker1 first = new Speaker1(1);
	Speaker2 second = new Speaker2();
	
	void powerOn() {
		first.on();
		second.on();
	}
	void powerOff() {
		first.off();
		second.off();
	}
	void volumeUp() {
		first.volumeUp();
		second.up();
	}
	void volumeDown() {
		first.volumeDown();
		second.down();
	}
	
}
