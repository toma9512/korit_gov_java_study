package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 참일 경우 계속 반복
        // for : 횟수 중심, while : 조건 중심
        /*
        while (조건) {
            반복할 코드
            조건을 변경할 코드
        }
         */
        // 1~5까지 출력
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; // 조건을 변경할 코드
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i--);
        }

        // 1~10까지 짝수만 출력
        int a = 2;
        while (a <= 10) {
            System.out.println(a);
            a += 2;
        }

        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        // 점수 입력 (0 ~ 100)
        // while (flag) {
        //     int score = scan.nextInt();
        //     if (score >= 0 && score <= 100) {
        //         System.out.println("점수는 " + score);
        //         flag = false; // break;
        //     } else {
        //         System.out.println("0~100까지의 숫자를 입력하세요");
        //     }
        // }

        int menu;
        // while (true) {
        //     System.out.println("메뉴를 선택하세요.");
        //     System.out.println("1. 주문하기");
        //     System.out.println("2. 취소하기");
        //     System.out.println("3. 재주문하기");
        //     System.out.print("메뉴를 고르세요 >>> ");
        //     menu = scan.nextInt();
        //
        //     switch (menu) {
        //         case 1 :
        //             System.out.println("주문하기 메뉴");
        //             break;
        //         case 2 :
        //             System.out.println("취소하기 메뉴");
        //             break;
        //         case 3 :
        //             System.out.println("재주문하기 메뉴");
        //             break;
        //         default :
        //             System.out.println("메뉴를 잘못 입력했습니다.\n");
        //             continue;
        //     }
        //     break;
        // }

        // 문제 : 1부터 100까지 누적 합
        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num++;
        }
        System.out.println(sum);

        // 문제 : 1번부터 100번까지 식당 웨이팅
        // 이때, 1번부터 차례대로 입장하는데 10번 손님이 입장할 때 한정 메뉴가 솔드 아웃
        // **번 손님 입장 출력
        // 솔드 아웃 되었기 때문에 가게 문 닫음
        // 마지막엔 영업 종료 출력
        int enter = 1;
        while (enter <= 100) {
            if (enter <= 10) {
                System.out.println(enter + "번 손님 입장");
            }
            if (enter == 10) {
                System.out.println("솔드 아웃");
                System.out.println("가게 문 닫음");
                break;
            }
            enter++;
        }

        // 1번부터 50번까지 웨이팅
        // 메뉴가 20개까지만 한정 판매 -> 솔드 아웃 가게 닫음
        // 이때 14번이 노쇼 -> 노쇼 발생 출력
        // 이것을 while문
        int waiting = 1;
        int count = 20;
        while (count > 0) {
            if (waiting == 14) {
                System.out.println("노쇼 발생!");
                count++;
            } else {
                System.out.println(waiting + "번 손님 입장");
            }
            waiting++;
            count--;
        }
        System.out.println("솔드 아웃");
        System.out.println("가게 문 닫음");
    }
}
