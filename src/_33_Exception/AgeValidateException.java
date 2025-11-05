package _33_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException {
    public static void main(String[] args) {
        // 나이를 입력 받고 검증 함수를 통해 확인
        // 나이를 입력 받을 때 nextInt로 받게 될텐데 문자열을 넣게 됐을 때의 예외처리도 함께
        // -> "숫자가 아닙니다. 정수를 입력해주세요." 출력
        // 검증함수에서 예외 발생 시 "예외 발생 : *에러메세지*" 출력
        // 마지막은 예외 발생 여부 관계없이 "검증 종료" 출력
        Scanner scanner = new Scanner(System.in);
        try {
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다. 정수를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 : "+e.getMessage());
        } finally {
            System.out.println("검증 종료");
        }
    }

    public static void validateAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("유효하지 않은 나이입니다. (입력값 : "+age+")");
        }
    }
}
