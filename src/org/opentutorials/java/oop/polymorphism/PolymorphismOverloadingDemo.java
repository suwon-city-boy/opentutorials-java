package org.opentutorials.java.oop.polymorphism;

public class PolymorphismOverloadingDemo {
	
	public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}

/*
 * 같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 오버로딩은 다형성의 한 예
 */
