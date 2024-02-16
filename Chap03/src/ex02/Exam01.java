package ex02;

public class Exam01 {

	public static void main(String[] args) {
		int exam = 4000;
		int h = exam / 3600;
		int m = (exam % 3600)/60;
		int s = (exam % 3600)%60;
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		
		// 출력
		// 1시간 6분 40초
		// 60m 6m 40s => 3600s 360s 40s
		
	}

}
