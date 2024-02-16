package ex03;
/* 문제
 * 매서드명 : change
 * 반환타입 : int[]
 * 매개변수 : int
 * 기능 : change함수에 정수값을 전달하면, 그 정수 수 만큼 배열을 생성해서 전달
 * 배열 안에는 1~10까지 난수 입력*/
public class Sample03 {
	public static void main(String[] args) {
		System.out.println("정수전달하면 정수크기만큼 배열을 생성해서 돌려주기!");
		System.out.print("배열 : ");

		int[] arr = change(3);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	
	}
	
	
	static int[] change(int x) {
		int[] arr = new int[x];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		return arr;
	}
}
