package org.opentutorials.java.oop.progenitor;

class Calculator{ //자동으로 extends Object를 붙인 것과 같음(모든 클래스는 Object를 암묵적으로 상속)
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    //Object클래스의 toString()을 오버로딩 하는 것
    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
}

/*
 * Object 클래스는 equals, notify, toString, wait 등의 함수를 가지고 있음
 * 모든 클래스는 암묵적으로 Object를 상속 받으므로 위의 함수 사용 가능
 */