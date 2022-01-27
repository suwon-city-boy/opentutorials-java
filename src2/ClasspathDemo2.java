class Item2 {
    public void print(){
        System.out.println("Hello world");  
    }
}
 
class ClasspathDemo2 {
    public static void main(String[] args){
        Item2 i1 = new Item2();
        i1.print();
    }
}

/*
 * java -classpath ".;lib" ClasspathDemo2
 * . -> 현재 디렉터리에서 클래스를 찾는다는 뜻이다.
 * ; -> 경로와 경로를 구분해주는 구분자
 * 환경변수? 운영체제에 지정하는 변수, 자바 가상머신과 같은 애플리케이션들은 환경변수의 값을 참고해서 동작
 * 자바는 클래스 패스로 환경변수 CLASSPATH를 사용, 이 값을 지정하면 실행할 때마다 -classpath 옵션을 사용하지 않아도 되기 때문에 편리
 */
