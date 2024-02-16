package ex02;

public class problem01 {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.getName("홍길동");
		st.getStudentId("20221234");
		st.getMajor("컴퓨터공학과");
		st.displayInformation();
		
		Student st1 = new Student("조조", "12345", "조나라왕");
		st1.displayInformation();

	}

}
