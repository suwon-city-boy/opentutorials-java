package org.opentutorials.java.basics.generic;

public class Person2<T, S> { //������ ���׸� ���
	public T info;
    public S id;
    
    Person2(T info, S id) { 
        this.info = info;
        this.id = id;
    }
    
    public <U> void printInfo(U info) { //�޼ҵ忡 ���׸� ���
    	System.out.println(info);
    }
}
