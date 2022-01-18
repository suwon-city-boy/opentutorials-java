package org.opentutorials.java.oop;

public class Constructor {
	int a, b;
	
	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a + this.b);
	}
}

/*
 * 생성자는 객체를 생성할 때 호출
 * 생성자의 특징
 * - 값을 반환하지 않음
 * - 생성자의 이름은 클래스의 이름과 동일(클래스 이름과 동일한 메소드는 생성자로 사용하기로 약속되어 있음)
 */