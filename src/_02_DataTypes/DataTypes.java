package _02_DataTypes;

/*
표기법

카멜 표기법 (단봉낙타 표기법) - 변수명, 메소드명
ex) firstName

파스칼 표기법 (쌍봉낙타 표기법) - 클래스명, 파일명
ex) FirstName
 */

public class DataTypes {
    public static void main(String[] args) {
        // 정수
        // int - 4byte (-2^31 ~ 2^31-1, 약 -21억~21억)
        // long - 8byte (-2^63 ~ 2^63-1)

        // 문자형
        // char - 2byte (한글자, ''로 표기)

        // 실수형
        // float - 4byte (마지막에 f표기)
        // double - 8byte

        // 논리형
        // boolean - 1byte (ture, false)

        System.out.println("안녕하세요"); // 문자열 -> ""로 감싸야한다
        System.out.println(123);
        System.out.println("123");
        System.out.println(3.14);

        /*
        변수 - 값을 담는 바구니
        데이터는 바뀔 수도 있고 하나씩 수정하기에는 비효율적
        재사용성 향상, 유지보수 향상

        자료형 변수명 = 데이터;
        자료형은 데이터의 형태
         */

        // 정수 - int, long
        int num1 = 10; // 10이라는 값을 가진 int 자료형의 변수
        System.out.println(num1);
        int age = 31;
        System.out.println(age);

        long num2 = 100000023523L; // int 범위를 벗어난 정수는 마지막에 L을 붙여줘야 한다
        num2 = 100_000_000_000L; // 재할당
        System.out.println(num2);

        // 실수 - float, double
        float num3 = 3.1415926234F; // float은 마지막에 F표기
        double num4 = 3.1415926234;
        System.out.println(num3); // 소수점 7번째까지 표기
        System.out.println(num4);

        // 문자, 문자열 - char, String
        char lastName = '정';
        String firstName = "희원";
        System.out.println(lastName);
        System.out.println(firstName);

        char char1 = '가';
        char char2 = '나';
        char char3 = '다';
        System.out.println(char1+char2+char3);
        System.out.println(""+char1+char2+char3);

        String hello = "안녕하세요";
        String name = "정희원";
        System.out.println(hello+" "+name);

        // 논리형 - boolean
        boolean isEmpty = false;
        System.out.println(isEmpty);

        // 이름 변수, 나이 변수, 주소 변수를 선언
        /*
        제 이름은 ***이고, 나이는 **살이며, ***에서 살고 있습니다.
         */

        // 변수 선언
        String myName = "정희원";
        int myAge = 31;
        String myAddress = "사직동";

        // 출력
        System.out.println("제 이름은 "+myName+"이고, 나이는 "+myAge+"살이며, "+
                myAddress+"에서 살고 있습니다.");
        System.out.printf("제 이름은 %s이고, 나이는 %d살이며, %s에서 살고 있습니다.\n",myName,myAge,myAddress);
    }
}
