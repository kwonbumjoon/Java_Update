package ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02_1 {
	public static void main(String[] args) {
		int sum = func1();
		System.out.print("두 수의 합은: " + sum);
	}
	
	static int func1() {
		return func2();
	}
	
	static int func2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력 >>");
		int num1=0, num2=0;
		
		// 문자 입력해서 예외가 발생하면 어떻게 처리?? -> 1) 내부에서 해결, 2) 예외 던지기
		// 1) 내부에서 해결
		try {
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return num1+num2;
	}
}
