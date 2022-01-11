package org.opentutorials.java.basics;

public class Comment {

	public static void main(String[] args) {
		
		System.out.println("주석1");
		
		//한줄 주석
		//System.out.println("주석2");
		
		//여러줄 주석
		/*
		System.out.println("주석3");
		System.out.println("주석4");
		System.out.println("주석5");
		System.out.println("주석6");
		 */
		
		System.out.println("주석7");
		
	}
	
	//JavaDoc 주석 -> JavaDoc문서(산출물) 생성 가능 + 클래스, 메서드를 설명할 때..
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
