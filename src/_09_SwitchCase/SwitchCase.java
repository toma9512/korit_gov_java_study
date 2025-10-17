package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Switch
        // break를 만날 때까지 계속 실행

        // ranking = 1 : 전액 장학금 출력
        // ranking = 2 : 반액 장학금 출력
        // ranking = 3 : 소정의 상금
        // 그 이하 : 박수

        int ranking = 2;

        // if (ranking == 1) System.out.println("전액 장학금");
        // else if (ranking == 2) System.out.println("반액 장학금");
        // else if (ranking == 3) System.out.println("소정의 상금");
        // else System.out.println("박수");

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 : // 2에서 멈추지 않고 바로 3으로 가서 출력 후 break;
                // System.out.println("반액 장학금");
                // break;
            case 3 :
                // System.out.println("소정의 상금");
                System.out.println("반액 장학금");
                break;
            default : // 모든 케이스를 만족하지 않을 때
                System.out.println("박수");
        }

        int grade = 1;
        int price = 7000;
        // 1등급 : 10000, 등급이 낮아질수록 -1000

        // price -= (grade - 1) * 1000;
        // System.out.println(price);

        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }

        System.out.println(price);

        // 월을 입력받고(int)
        // 3,4,5 : Spring
        // 6 ~ 8 : Summer
        // 9 ~ 11 : Autumn
        // 12, 1, 2 : Winter

        // Scanner scan = new Scanner(System.in);
        // int month = scan.nextInt();

        // switch (month) {
        //     case 3: case 4: case 5:
        //         System.out.println("Spring");
        //         break;
        //     case 6: case 7: case 8:
        //         System.out.println("Summer");
        //         break;
        //     case 9: case 10: case 11:
        //         System.out.println("Autumn");
        //         break;
        //     case 12: case 1: case 2:
        //         System.out.println("Winter");
        //         break;
        // }

        // 숫자 a를 입력받고
        // 연산자 기호를 입력받고 (+, -, *, /) -> 이외에는 유효한 기호가 아닙니다.
        // 숫자 b를 입력받는다

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        String operator = scan.nextLine();
        int b = scan.nextInt();

        switch (operator) {
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            default :
                System.out.println("유효한 기호가 아닙니다.");
        }
    }
}
