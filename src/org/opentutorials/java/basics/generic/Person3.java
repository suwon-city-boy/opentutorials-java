package org.opentutorials.java.basics.generic;

//제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한(상속 이용)
public class Person3<T extends Info> {
	public T info;
    Person3(T info){ this.info = info; }
}
