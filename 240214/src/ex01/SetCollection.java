package ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {
		// 중복 저장되지 않는다, 순서가 없다.
		Set<String> set = new HashSet<String>();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		
		Iterator<String> it = set.iterator(); // 반복자
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		
		// 재 출력하려면 한번 더 사용해야 한다.
		it = set.iterator(); // 반복자
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		
		
		
		
//		System.out.println(set.toString());
	}

}
