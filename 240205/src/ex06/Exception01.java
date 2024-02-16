package ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 예외 처리 
 * try{} 이 구문에서 문제가 되는 게 있는 경우(문제가 될 경우들)
 * catch(){} 이 구문에서 예외를 처리함
 * 
 * catch(Exception e) {e.printStackTrace();} 
 * ㄴ>> 이 구문으로 모든 예외를 처리함
 * */
public class Exception01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개 입력>>");
		double div = 0;
		
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			div = (double)num1 / num2;
			
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("나누기 : " + div);
		
		System.out.println("프로그램 종료!!!");
	}
}
