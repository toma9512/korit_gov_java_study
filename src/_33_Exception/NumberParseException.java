package _33_Exception;

import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        try {
            int n = Integer.parseInt(word);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력하셨습니다.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
