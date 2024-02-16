package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetCollection2 {
	public static void main(String[] args) {
		// 중복 저장되지 않는다, 순서가 없다.
//		Set<String> set = new HashSet<String>();
		
		
//		set.add("Toy");
//		set.add("Box");
//		set.add("Robot");
//		set.add("Toy");
//		
//		Iterator<String> it = set.iterator(); // 반복자
//		while(it.hasNext())
//			System.out.print(it.next() + " ");
//		System.out.println();
//		System.out.println(set.toString());
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
	}

}
