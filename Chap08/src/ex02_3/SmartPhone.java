package ex02_3;

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

	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color);	// 상위 클래스 생성자 호출
		System.out.println("SmartPhone(String model, String color, boolean wifi)");
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
