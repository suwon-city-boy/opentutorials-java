package org.opentutorials.java.oop.overloading;

public class Calculator {
	int left, right;
	int third = 0;
	
	int[] oprands; //배열로 응용
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int[] oprands){ //오버라이딩
        this.oprands = oprands;
    }
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void sum2(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
	
	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}