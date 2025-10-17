package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // 반복문 - For
        /*
        for (선언; 조건; 증감) {
            반복할 코드
        }
         */
        for (int i=0; i<10; i++) {
            System.out.println("안녕");
        }

        for (int i=1; i<=50; i++) {
            if (i%2 == 0) System.out.println(i);
        }

        // 문제
        // 1~100까지 더한 총합을 구하시오

        // int sum = 0;
        // for (int i=1; i<=100; i++) sum += i;
        // System.out.println(sum);


        // 문제
        // 1~100까지 중에 짝수만 더한 총합을 구하시오
        int sum = 0;
        for (int i=2; i<=100; i+=2) sum += i;
        System.out.println(sum);


        // 구구단 출력하기 (한 단만)
        // 특정 단을 입력받아서 1~9까지 구구단 출력
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // for (int i=1; i<=9; i++) {
        //     System.out.printf("%d x %d = %d\n", a, i, a*i);
        // }

        // 구구단 전체 출력
        for (int i=1; i<=9; i++) {
            System.out.println(i+"단");
            for (int j=1; j<=9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }

        // 별 찍기
        for (int i=0; i<5; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------");

        // 역으로 별 찍기
        for (int i=0; i<5; i++) {
            for (int j=0; j<5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // break, continue

        for (int i=1; i<=10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // 1~50까지 수 중에서 3의 배수 뺴고 출력하기
        // 단, 3의 배수는 " " 띄어쓰기 한칸 출력으로 대체
        for (int i=1; i<=50; i++) {
            if (i%3 == 0) {
                System.out.println(" ");
                continue;
            }
            System.out.println(i);
        }

        // 1부터 계속 합계를 구하되 합계가 200이 넘어가면 정지
        // 마지막은 최종 합과 마지막으로 더한 수를 출력

        int sum1 = 0;
        int num = 0;
        for (int i=1; ; i++) {
            sum1 += i;
            if (sum1 > 200) {
                num = i;
                break;
            }
        }
        System.out.println("합계 : " + sum1);
        System.out.println("마지막으로 더한 수 : " + num);


        // 1부터 100까지 수 중에서 3의 배수와 5의 배수의 개수를 각각 출력
        int three = 0;
        int five = 0;
        for (int i=1; i<=100; i++) {
            if (i%3 == 0) three++;
            if (i%5 == 0) five++;
        }
        System.out.println("3의 배수 : " + three);
        System.out.println("5의 배수 : " + five);
        System.out.println(100/3);
        System.out.println(100/5);

        // 정수 5개를 입력받고 입력받은 수 중 가장 큰 값 출력
        // 범위 1~100 만약 1에서 100사이가 아니라면 "범위를 벗어났습니다" 출력 후 멈추기
        // int max = 0;
        // boolean check = true;
        // Scanner scan = new Scanner(System.in);
        // for (int i=0; i<5; i++) {
        //     int temp = scan.nextInt();
        //     if (temp < 1 || temp > 100) {
        //         System.out.println("범위를 벗어났습니다");
        //         check = false;
        //         break;
        //     }
        //     max = (max > temp) ? max : temp;
        // }
        // if (check) System.out.println(max);


        // 팩토리얼
        // 숫자를 입력받아 팩토리얼 구하기
        // int factorial = 1;
        // Scanner scan = new Scanner(System.in);
        // int target = scan.nextInt();
        // for (int i=1; i<=target; i++) {
        //     factorial *= i;
        // }
        // System.out.println(factorial);


        // 1~50까지 반복
        // 3, 6, 9일 때는 박수 출력
        // 5일 때는 으악 출력
        for (int i=1; i<=50; i++) {
            boolean check = true;
            if (i%10 != 0 && (i%10)%3 == 0) {
                System.out.print("박수");
                check = false;
            } else if (i%10 == 5) {
                System.out.print("으악");
                check = false;
            }
            if (i/10 == 3) {
                System.out.print("박수");
                check = false;
            }
            if (i/10 == 5) {
                System.out.print("으악");
                check = false;
            }
            if (check) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
