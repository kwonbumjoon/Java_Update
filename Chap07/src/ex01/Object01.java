package ex01;

public class Object01 {
	public static void main(String[] args) {
		Student stObj1 = new Student();
		
		stObj1.id = 20221004;
		stObj1.name = "홍길순";
		stObj1.printInfo();
		// 변수를 입력 후 출력하는 메서드 사용
		
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005, "홍길동");
		stObj2.printInfo();
		// insertRecord라는 메서드를 사용하여 변수를 변경 후 출력하는 메서드 사용
	}
}
