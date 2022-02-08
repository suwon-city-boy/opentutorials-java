package org.opentutorials.java.oop.progenitor;

public class Student {
	String name;
	
    Student(String name){
        this.name = name;
    }
    
    public boolean equals(Object obj) {
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}
