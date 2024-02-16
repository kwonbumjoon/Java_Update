package ex02;

import java.util.LinkedList;

public class Example02 {
	public static void main(String[] args) {
		LinkedList<String> cats = new LinkedList<>();
		
		cats.add("러시안블루");
		cats.addFirst("페르시안");
		cats.addLast("래그돌");
		System.out.println(cats);
		
		cats.add(1, "샴");
		System.out.println(cats);
		
		cats.set(2, "코리안 쇼트헤어");
		System.out.println(cats);
		
		cats.removeFirst();
		cats.removeLast();
		System.out.println(cats);
		cats.remove(1);				// remove() 공백으로 두면 자동으로 0번째를 삭제 처리
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
	}
}
