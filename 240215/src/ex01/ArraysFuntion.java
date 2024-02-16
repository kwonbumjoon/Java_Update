package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFuntion {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2;
		
		Arrays.setAll(arr, num -> (int)(Math.random()*10)+1);
		System.out.println(Arrays.toString(arr));
		
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));

		arr2 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arr2));
		
		
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(10,20,30,40,50); // 다수의 초기값 설정 가능
//		List list = new Arrays.asList(10,20,30,40,50); // 위와 같음
		System.out.println(list);
//		list.add(60);	사용불가! 
		
//		값을 추가하고 싶으면 ArrayList로 다시 변경해야한다.
		list = new ArrayList(list);
		list.add(60);
		list.add(70);
		System.out.println(list);
		
		
	}
}
