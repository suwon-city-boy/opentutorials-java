package org.opentutorials.java.oop;

public class Scope {
	int v = 10;
	 
	void m() {
		int v = 20;
	    System.out.println(this.v);
	}
}

/*
 * this는 인스턴스 자신을 의미하는 키워드
 * 객체지향 프로그래밍에서도 가급적이면 전역변수의 사용을 자제하는 것이 좋음
 * 단일 객체가 너무 비대해지지 않도록 적절하게 규모를 쪼개는 것도 중요
 */