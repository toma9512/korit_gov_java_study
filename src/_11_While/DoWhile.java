package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 - Do While
        // 일단 한번 실행 후 조건 검사
        // -> 조건에 상관없이 무조건 최초 1회는 실행
        // while은 조건 검사 후 실행

        /*
        do {
            반복될 코드 -> 최초 한번은 실행
        } while (조건);
         */

        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i<=5);


        int choice;
        Scanner scan = new Scanner(System.in);

        // do {
        //     System.out.println("---메뉴---");
        //     System.out.println("1. 주문하기");
        //     System.out.println("2. 취소하기");
        //     System.out.println("0. 종료하기");
        //     System.out.print("선택 : ");
        //     choice = scan.nextInt();
        //
        //     switch (choice) {
        //         case 1 :
        //             System.out.println("주문을 합니다.");
        //             break;
        //         case 2 :
        //             System.out.println("취소를 합니다.");
        //             break;
        //         case 0 :
        //             System.out.println("종료합니다.");
        //             break;
        //         default :
        //             System.out.println("올바른 번호를 입력하세요.");
        //     }
        // } while (choice != 0);

        // 1부터 n까지 합 (do-while)
        // n은 입력받기
        // int n = scan.nextInt();
        // int sum = 0;
        // int count = 1;
        //
        // do {
        //     sum += count++;
        // } while (count<=n);
        // System.out.println(sum);

        // 숫자 맞추기 게임
        int answer = (int) (Math.random()*100 + 1); // 1~100
        // 숫자를 입력 받아서 정답을 맞추기
        // 업 다운 출력
        // 시도한 횟수를 나중에 정답 맞췄을 떄 같이 출력
        int count = 1;

        do {
            int input = scan.nextInt();

            if (input == answer) {
                System.out.println("정답 : "+answer+", "+count+"번 만에 맞추었습니다!");
                break;
            } else if (input < answer) {
                System.out.println("UP");
            } else {
                System.out.println("DOWN");
            }
            count++;
        } while (true);
    }
}
