package ex01;

public class new01 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		// arr1과 arr2의 배열의 값은 같지만 배열내의 값을 가리키는 주소는 다르다.
		
		System.out.println(arr1 == arr2);	

		System.out.println(arr1 == arr3);
		
		System.out.println(arr2 == arr3);
		
	}

}
