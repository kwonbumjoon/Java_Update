package ex01;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; };
	void channalUp() { ++channel; };
	void channelDown() { --channel; };
}
