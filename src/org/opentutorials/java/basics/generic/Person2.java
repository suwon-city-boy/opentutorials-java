package org.opentutorials.java.basics.generic;

public class Person2<T, S> { //복수의 제네릭 사용
	public T info;
    public S id;
    
    Person2(T info, S id) { 
        this.info = info;
        this.id = id;
    }
    
    public <U> void printInfo(U info) { //메소드에 제네릭 사용
    	System.out.println(info);
    }
}
