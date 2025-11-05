package _33_Exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException{
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer";
        try {
            login(inputId, inputPassword);
        }catch (LoginFailedException e) {
            System.out.println("로그인 실패 : "+e);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
