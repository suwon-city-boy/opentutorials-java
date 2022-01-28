package org.opentutorials.java.oop.finals;

public class Calculator {
	//변하지 않을 이런 값은 변수 앞에 final을 붙여서 이 값이 변경되는 것을 규제할 수 있음
	static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        
        //final로 지정된 변수에는 한번 값이 할당되면 그 값을 바꿀 수 없음
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
