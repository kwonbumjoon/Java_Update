package ex02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	}
}
