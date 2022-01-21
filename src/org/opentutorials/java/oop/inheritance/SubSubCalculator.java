package org.opentutorials.java.oop.inheritance;

public class SubSubCalculator extends SubCalculator {
	public SubSubCalculator (int left, int right) {
		super(left, right);
	}
	public void multiplication() {
        System.out.println(this.left * this.right);
    }
}
