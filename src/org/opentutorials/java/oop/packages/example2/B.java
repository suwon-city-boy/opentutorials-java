package org.opentutorials.java.oop.packages.example2;
import org.opentutorials.java.oop.packages.example1.*;

public class B {

	public static void main(String[] args) {
		A a = new A();
	}
}

/*
 * 패키지? 로직들을 관리하는 가장 큰 틀의 체계(파일 시스템의 디렉터리와 상당히 유사)
 * import를 통해서 다른 패키지의 클래스를 현재의 소스코드로 로드
 * javac 뒤에 붙는 -d bin은 컴파일된 결과를 bin 디렉토리 하위에 위치시킨다는 의미
 * 이클립스 프로젝트 디렉터리 구성
 * -src : 소스 코드
 * -bin : 컴파일된 클래스 파일
 */