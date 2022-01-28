package org.opentutorials.java.oop.abstractclass;

abstract public class A {
	//abstract 키워드를 가진 메소드는 본체가 없어야함
	//하위 클래스에서 상속하여 구현(overriding)
	//추상 메소드를 하나라도 포합하고 있으면 추상 클래스가 되고, abstract가 붙음
	public abstract int b();
	
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있음
	public void d() {
		System.out.println("hello");
	}
}
