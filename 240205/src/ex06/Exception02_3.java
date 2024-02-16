package ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02_3 {
	public static void main(String[] args) throws InputMismatchException {
		// func2에서 예외를 던지기 때문에 2가지 방법으로 예외처리가능
		// 내부 처리, 외부 던지기
		int sum = func1();
		System.out.print("두 수의 합은: " + sum);
	}
	
	static int func1() {
		return func2();
	}
	
	static int func2() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력 >>");
		int num1=0, num2=0;
		
		// 문자 입력해서 예외가 발생하면 어떻게 처리?? -> 1) 내부에서 해결, 2) 예외 던지기
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("func2 end------------------");
		return num1+num2;
	}
}
