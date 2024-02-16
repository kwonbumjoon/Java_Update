package ex02;
/* 문제
 * 클래스 이름 : Car
 * 속성 : make(제조사), model(모델), year(제조년도), color(색상)
 * 기능 :
 * startEngine(): 엔진을 켜는 메소드
 * stopEngine(): 엔진을 끄는 메소드
 * displayCarDetails(): 자동차의 모든 정보를 출력하는 메소드
 * 초기화 : setter 이용*/
public class Car {
	private String make;
	private String model;
	private int year;
	private String color;
	
	private boolean engine;
	
	
	Car(){}
	
	// setter
	void setCar(String ma, String mo, int y, String c) {
		make = ma;
		model = mo;
		year = y;
		color = c;
	}
	void setMake(String ma) {
		make = ma;
	}
	void setModel(String mo) {
		model = mo;
	}
	void setYear(int y) {
		year = y;
	}
	void setColor(String c) {
		color = c;
	}

	
	boolean startEngine() {
		return engine = true;
	}
	boolean stopEngine() {
		return engine = false;
	}
	void displayCarDetails() {
		System.out.println("제조사 : " + make);
		System.out.println("모델 : " + model);
		System.out.println("제조년도 : " + year);
		System.out.println("색상 : " + color);
	}
}
