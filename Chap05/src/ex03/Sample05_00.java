package ex03;

import java.util.Scanner;

/* 문제
 * 매소드 : findMax
 * 매개변수 : int[]
 * 반환타입 : int
 * 기능 : 정수 배열(5개짜리 배열)을 사용자로부터 입력받아 배열 내의 최대값을 찾아 반환합니다.
 * */
public class Sample05_00 {
	public static void main(String[] args) {

		int[] arrNum = new int[5];
		System.out.println("5개 정수를 입력하시오.");
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<arrNum.length; i++) {
			arrNum[i] = s.nextInt();
		}
		
		int result = findMax(arrNum);
		System.out.println("Max : " + result);

	}
	
	static int findMax(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
