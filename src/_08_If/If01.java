package _08_If;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        // 조건문 : if문
        /*
        if (조건) {
            해당 조건이 참일 때 실행될 코드
        } else {
            해당 조건이 거짓일 때 실행될 코드
        }
         */

        int height = 140;
        // 키가 120이상이면 탑승 가능 출력
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
        // String result = (height>=120) ? "탑승 가능" : "탑승 불가능";

        // 키가 120이면서 어린이인 경우만 탑승 가능
        boolean isKid = true;
        if (height>=120 && isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상이거나 어린이인 경우 탑승 가능
        if (height>=120 || isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 1. 3의 배수인지 판단
        int num1 = 12;
        if (num1%3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }

        // 2. 절댓값 출력
        int num2 = -12;
        if (num2 < 0) {
            System.out.println(-num2);
        } else {
            System.out.println(num2);
        }

        // 3. 최댓값 출력
        int num3 = 12;
        int num4 = 8;
        if (num3 > num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }

        // 4. 아이디 비밀번호 확인
        String userId = "myid1234";
        String userPw = "qwer1234";

        Scanner scan = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String inputId = scan.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String inputPw = scan.next();

        if (userId.equals(inputId)) {
            if (userPw.equals(inputPw)) {
                System.out.println("로그인 확인");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }
}
