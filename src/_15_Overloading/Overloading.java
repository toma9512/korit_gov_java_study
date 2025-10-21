package _15_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        return (int) (doubleNum * doubleNum);
    }

    public static void printInfo(String name) {
        System.out.println(name);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name+" "+age);
    }

    public static void printInfo(String name, int age, String eMail) {
        System.out.println(name+" "+age+" "+eMail);
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 개 선언
        // 전달값(파라미터)의 타입이 달라야한다.
        // 또는 갯수가 달라야한다.
        // 반환값은 같아도 된다.

        System.out.println(getPower(4));
        System.out.println(getPower(2.5));

        // printInfo()
        // 문자열 이름만 전달해서 -> 이름 출력
        // 문자열 이름, 정수 나이 -> 둘 다 출력
        // 문자열 이름, 정수 나이, 문자열 이메일 -> 셋 다 출력
        printInfo("정희원");
        printInfo("정희원", 31);
        printInfo("정희원", 31, "gmldnjs985@gmail.com");
    }
}
