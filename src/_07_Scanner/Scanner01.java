package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner : 입력받기
        Scanner scan = new Scanner(System.in);

        // next() : 토큰 단위로 읽는다.
        // 토큰 : 공백문자(띄어쓰기, 탭, 엔터)
        // String str1 = scan.next();
        // String str2 = scan.next();
        // System.out.println("str1 : " + str1);
        // System.out.println("str2 : " + str2);

        // nextLine() : 엔터 단위로 읽는다. 한 줄을 읽음
        // String str3 = scan.nextLine();
        // System.out.println("str3 : " + str3);

        // nextInt() : 정수 입력받기, 개행문자를 무시하고 입력을 받는다
        // 엔터를 치면 엔터 전까지 입력받고 엔터의 개행문자는 남게 됨
        // int num1 = scan.nextInt();
        // System.out.println("num1 : " + num1);
        // int num2 = scan.nextInt();
        // System.out.println("num2 : " + num2);

        // int num = scan.nextInt(); // 123\n
        // scan.nextLine();
        // String str = scan.nextLine();
        // System.out.println("num : " + num);
        // System.out.println("str : " + str);

        // 나이와 이름을 입력 받아서
        // 출력 : 31살 정희원입니다.
        // 나이를 먼저 입력받아야 한다.
        System.out.print("나이 입력 : ");
        int age = scan.nextInt();

        System.out.print("이름 입력 : ");
        String name = scan.next();

        System.out.printf("%d살 %s입니다.\n",age,name);
    }
}
