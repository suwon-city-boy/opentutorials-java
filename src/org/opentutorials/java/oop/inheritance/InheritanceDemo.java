package org.opentutorials.java.oop.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		SubCalculator subCalc = new SubCalculator(10, 20);
		subCalc.sum();
		subCalc.avg();
		subCalc.substract();
		
		SubSubCalculator subSubCalc = new SubSubCalculator(10, 20);
		subSubCalc.setOprands(20, 30);
		subSubCalc.sum();
		subSubCalc.substract();
		subSubCalc.multiplication();
	}

}
