package ex01;

public class Constructor01 {
	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student StOjb = new Student();
		
		StOjb.insertRecord(2022, "홍길순");
		StOjb.printInfo();
	}
}
