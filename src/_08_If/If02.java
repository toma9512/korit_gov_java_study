package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        /*
        if (조건1) {
            조건1이 참일 때 실행될 코드
        } else if (조건) {
            조건2가 참일 때 실행될 코드
        } else {
            조건1, 조건2가 모두 거짓일 때
        }
         */

        // 문제
        int avgScore = 77;
        if (avgScore >= 90) {
            System.out.println("A");
        } else if (avgScore >= 80) {
            System.out.println("B");
        } else if (avgScore >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // x,y를 입력받고 몇 사분면에 있는지 출력하시오
        Scanner scan = new Scanner(System.in);

        System.out.print("x 입력 : ");
        int x = scan.nextInt();
        System.out.print("y 입력 : ");
        int y = scan.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("x와 y는 0이 될 수 없습니다.");
        } else if (x > 0) {
            if (y > 0) System.out.println("제 1사분면");
            else System.out.println("제 4사분면");
        } else {
            if (y > 0) System.out.println("제 2사분면");
            else System.out.println("제 3사분면");
        }
    }
}
