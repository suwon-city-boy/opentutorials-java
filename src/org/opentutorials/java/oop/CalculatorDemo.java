package org.opentutorials.java.oop;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum(); //30
		c1.avg(); //15
		
		Calculator c2 = new Calculator();
		c2.setOprands(40, 20);
		c2.sum(); //60
		c2.avg(); //30
		
		Calculator2 c3 = new Calculator2();
		c3.setOprands(10, 20);
		c3.sum(); //130
		c3.avg(); //15
		
		Calculator2 c4 = new Calculator2();
		c4.setOprands(40, 20);
		c4.sum(); //160
		
		// 인스턴스를 통해서 PI에 접근
		System.out.println(c3.PI); //3.14
		System.out.println(c4.PI); //3.14
		// 클래스를 통해서 PI에 접근
		System.out.println(Calculator2.PI); //3.14
		
		Calculator2.special = 1000; //클래스 변수 값 변경(지정)
		c4.sum(); //1060
		
		Calculator3 c5 = new Calculator3();
		c5.sum(10, 20); //30
		c5.avg(10, 20); //15
	}

}
