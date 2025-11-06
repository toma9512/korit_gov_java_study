package _34_Lambda.Calculator;

/*
람다식을 단일 메소드만 가지는 인터페이스(함수형 인터페이스)를 구현하는 형태
구현해야할 메소드가 하나만 정의된 인터페이스
@FunctionalInterface 어노테이션을 사용하면 컴파일 시에 단일 메소드인지 체크
 */

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}
