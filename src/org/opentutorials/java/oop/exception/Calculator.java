package org.opentutorials.java.oop.exception;

class Calculator{
	
    int left, right;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    public void divide(){
    	try { //try �ȿ��� ���� ��Ȳ�� �߻��� ������ ����Ǵ� ������ ��ġ��Ŵ
    		System.out.print("������� ");
    		//������ �߻��ϸ鼭 try ���� ������ �ߴܵǰ� catch ���� ���� ������ ����
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
    	}
    	//Exception�� �ڹٿ��� �⺻������ �����ϴ� Ŭ������ java.lang�� �ҼӵǾ� ����
    	//���ܰ� �߻��ϸ� �ڹٴ� ��ġ �޼ҵ带 ȣ���ϵ��� catch�� ȣ���ϸ鼭 �� ���ڷ� Exception Ŭ������ �ν��Ͻ��� ����
    	catch(Exception e) { //catch �ȿ��� ���ܰ� �߻����� �� �޼����� �ϱ� ���� ������ ��ġ��
    		//e.getMessage()�� �ڹٰ� ������ �ν��Ͻ��� �޼ҵ� �� getMessage�� ȣ���ϴ� �ڵ�
    		//getMessage�� ������ ������ ����� �����ϱ� ���� ���·� ����
    		//������ ���� �⺻���� ������ ���
    		System.out.println("������ �߻��߽��ϴ� : " + e.getMessage());
    		//e.toString()�� e.getMessage()���� �� �ڼ��� ���� ������ ����
    		System.out.println("\n\ne.toString()\n" + e.toString());
    		//�޼ҵ� getMessage, toString���� �ٸ��� printStackTrace�� ���ϰ��� ����
    		//�� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ���
    		//printStackTrace�� ���� �ڼ��� ���� ������ ����
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
    	}
    	finally {
            System.out.println("finally");
        }
    }
} 

/*
 * ���ܶ� ���α׷��� ���� ���α׷��Ӱ� ������ �������� ó������ ����� ��쿡 �̸� ó���ϱ� ���� ���
 * ���ǹ��� else ifó�� ���� ���� catch�� �ϳ��� try �������� ����� �� ����
 * finally�� try �������� ���ܰ� �߻��ϴ� �Ͱ� ������� ������ ����Ǵ� ����
 
 * (ex) �����ͺ��̽��� ����Ѵٸ� �����ͺ��̽� ������ �����ؾ� ��
 * �̶� �����ͺ��̽� ������ �ۼ��� ���ø����̼��� ���� ���ӻ��¸� ����
 * �����ͺ��̽��� �����ϴ� �������� ���ܰ� �߻��ؼ� �� �̻� �ļ� �۾��� �����ϴ� ���� �Ұ����� ��찡 ���� �� ����
 * ���ܰ� �߻��ߴٰ� �����ͺ��̽� ������ ���� ������ �����ͺ��̽��� ���� ���¸� �����ϰ� �ǰ�
 * �����ͺ��̽��� �� �̻� ������ ������ �� ���� ���¿� ���� �� ����
 * ������ ���� �۾��� ���� �߻����ο� ������� ������ finally���� ó���ϱ⿡ ���� �۾�
 */