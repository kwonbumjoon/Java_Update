package ex01;

public class note05 {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += 100;
			System.out.print(arr[i] + " ");
		}

		//for each 문
		System.out.println();
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		String[] str = {"kor", "eng", "math", "com", "sci"};
		for(String s: str)
			System.out.print(s + " ");
	}
}
