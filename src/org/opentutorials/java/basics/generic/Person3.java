package org.opentutorials.java.basics.generic;

//���׸����� �� �� �ִ� ������ Ÿ���� Ư�� Ŭ������ �ڽ����� ����(��� �̿�)
public class Person3<T extends Info> {
	public T info;
    Person3(T info){ this.info = info; }
}
