package ex02;
/* 문제
 * 클래스 이름 : student
 * 속성 : name(이름) / StudentId(학번) / major(전공)
 * 기능 : displayInformation() : 학생의 모든 정보를 출력하는 메소드
 * 초기화 - 생성자 이용, or setter 이용*/
public class Student {
	private String name;
	private String studentId;
	private String major;
	
	Student() {}	// 디폴트 생성자
	
	Student(String n, String s, String m){
		name = n;
		studentId = s;
		major = m;
	}
	
	void getName(String s){
		name = s;
	}
	void getStudentId(String id) {
		studentId = id;
	}
	void getMajor(String m) {
		major = m;
	}
	void displayInformation() {
		System.out.println("이름 : " +name);
		System.out.println("학번 : " +studentId);
		System.out.println("전공 : " +major);
	}
}
