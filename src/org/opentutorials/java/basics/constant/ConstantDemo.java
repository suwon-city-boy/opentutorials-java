package org.opentutorials.java.basics.constant;

public class ConstantDemo {
	public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("���� ���ð� ȸ�� ������ ����.");
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
 * enum�� class, interface�� ������ ������ ������ ����(������ ��ǻ� class)
 * enum���� ���� ������ ������ ������ �ֱ� ������ �����ϱ� ���ؼ� enum�̶�� Ű���带 ���
 * 
 * enum�� ����ϴ� ����
 * 1. �ڵ尡 �ܼ�����
 * 2. �ν��Ͻ� ������ ����� ����
 * 3. Ű���� enum�� ����ϱ� ������ ������ �ǵ��� �������� �и��ϰ� ��Ÿ�� �� ����
 
 * �������� ������ ������ �����Ѵ�. �� �� ������ ������� �ʵ��� ����
 * ������ ��ü�� Ŭ�����̱� ������ ������ ���ο� ������, �ʵ�, �޼ҵ带 ���� �� �־ �ܼ��� ����� �ƴ϶� �� ���� ���� ����
 */