package _33_Exception;

/*
AgeRestrictionException
-> 나이 제한에 대한 예외 클래스
 */

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class SignupException {
    /*
    signup(String username, int age)
    -> 가입 조건 : 만 14세 이상
    -> 이 조건에 만족하지 않으면 AgeRestrictionException을 발생
    -> 해당 예외는 호출한 곳에서 처리
    만약, 예외가 발생하지 않는다면 "username님, 가입을 환영합니다." 호출
     */
    static void signup(String username, int age) throws AgeRestrictionException {
        if (age < 14) {
            throw new AgeRestrictionException("14세 미만은 가입할 수 없습니다.");
        }
        System.out.println(username+"님, 가입을 환영합니다.");
    }

    public static void main(String[] args) {
        try {
            signup("정희원", 13);
        } catch (AgeRestrictionException e) {
            System.out.println("회원 가입 실패 : "+e.getMessage());
        } finally {
            System.out.println("회원 가입 처리 종료");
        }
    }
}
