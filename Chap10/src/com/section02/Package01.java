package com.section02;

import com.javamaster.mypackage.*;		// com.javamaster.mypackage 패키지 내 Cat클래스 사용하기 위해 import 사용
public class Package01 {
	public static void main(String[] args) {
		Cat myCat = new Cat();	// com.javamaster.mypackage 패키지 내 Cat 클래스의 생성자 호출
		myCat.eat();			// com.javamaster.mypackage 패키지 내 Cat 클래스 메서드 호출
		myCat.scratch();
		myCat.meow();
	}
}
