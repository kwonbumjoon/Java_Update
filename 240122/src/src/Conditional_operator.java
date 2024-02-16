package src;

public class Conditional_operator {

	public static void main(String[] args) {
		
		// 삼항 연산자(조건 연산자)
		// 조건이 참이면 앞의 결과 아닐 경우 뒤의 결과 출력
		
		int jumsu = 59;
		
		String msg = (jumsu >= 60) ? "합격" : "불합격";
		
		System.out.println(msg);
	
	}

}
