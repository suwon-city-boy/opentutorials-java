package org.opentutorials.java.basics.constant;

public class ConstantDemo {
	public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}

/*
 * enum은 class, interface와 동급의 형식을 가지는 단위(하지만 사실상 class)
 * enum만을 위한 문법적 형식을 가지고 있기 때문에 구분하기 위해서 enum이라는 키워드를 사용
 * 
 * enum을 사용하는 이유
 * 1. 코드가 단순해짐
 * 2. 인스턴스 생성과 상속을 방지
 * 3. 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있음
 
 * 열거형은 연관된 값들을 저장한다. 또 그 값들이 변경되지 않도록 보장
 * 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 필드, 메소드를 가질 수 있어서 단순히 상수가 아니라 더 많은 역할 가능
 */