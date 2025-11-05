package _33_Exception;

/*
1. Error : 시스템적 오류 (JVM이 감당 못함) -> OutOfMemoryError, StackOverflowError
2. Exception : 개발자가 처리 가능한 오류 -> NullPointerException, IOException

예외(Exception)
- 프로그램 실행 중 발생할 수 있는 비정상적인 상황을 객체로 표현한 것
 */

public class Exception01 {
    public static void main(String[] args) {
        // 예외 처리를 하는 이유
        // Java의 특성 상 예외가 하나라도 발생하면 전체 컴파일링을 실패로 간주
        /*
        try - catch - finally 구문 / throws 키워드
        try {
            예외가 발생할 수 있는 코드
        } catch (ExceptionType e) {
            예외가 발생했을 때 실행할 코드
        } finally {
            예외의 발생여부와 상관없이 실행할 코드
        }
         */
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생 >> " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]);
        } catch (Exception e) {
            // throw new RuntimeException(e.getMessage());
            // throw : 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역할
            // 반드시 new 키워드를 이용해서 예외 객체를 생성해야 한다.
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
