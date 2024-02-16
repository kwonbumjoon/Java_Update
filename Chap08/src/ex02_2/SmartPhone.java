package ex02_2;

public class SmartPhone extends Phone {
	// 필드 선언
	public boolean wifi;
	
	public SmartPhone() {
		System.out.println("Smartphone()");
	}
	
	public SmartPhone(boolean wifi) {
		System.out.println("SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SmartPhone [wifi=" + wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
