package org.opentutorials.java.oop.progenitor;

class Calculator{ //�ڵ����� extends Object�� ���� �Ͱ� ����(��� Ŭ������ Object�� �Ϲ������� ���)
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
    
    //ObjectŬ������ toString()�� �����ε� �ϴ� ��
    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
}

/*
 * Object Ŭ������ equals, notify, toString, wait ���� �Լ��� ������ ����
 * ��� Ŭ������ �Ϲ������� Object�� ��� �����Ƿ� ���� �Լ� ��� ����
 */