package org.opentutorials.java.oop.accessmodifier;

public class A {

	public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
