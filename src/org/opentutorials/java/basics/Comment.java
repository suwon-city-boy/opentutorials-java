package org.opentutorials.java.basics;

public class Comment {

	public static void main(String[] args) {
		
		System.out.println("�ּ�1");
		
		//���� �ּ�
		//System.out.println("�ּ�2");
		
		//������ �ּ�
		/*
		System.out.println("�ּ�3");
		System.out.println("�ּ�4");
		System.out.println("�ּ�5");
		System.out.println("�ּ�6");
		 */
		
		System.out.println("�ּ�7");
		
	}
	
	//JavaDoc �ּ� -> JavaDoc����(���⹰) ���� ���� + Ŭ����, �޼��带 ������ ��..
	/**
	 * Prints an integer and then terminate the line.  This method behaves as
	 * though it invokes <code>{@link #print(int)}</code> and then
	 * <code>{@link #println()}</code>.
	 *
	 * @param x  The <code>int</code> to be printed.
	 */
	public void println(int x) {
	    synchronized (this) {
	        //print(x);
	        //newLine();
	    }
	}

}
