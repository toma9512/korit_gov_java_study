package _34_Lambda.Calculator;

import java.util.function.Predicate;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> a+b;
        Calculator sub = (a, b) -> a-b;
        Calculator mul = (a, b) -> a*b;
        Calculator div = (a, b) -> a/b;

        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        Predicate<Integer> isZero = (num) -> num == 0;
        Calculator div2 = (x, y) -> {
            if (isZero.test(y)) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x/y;
        };
        System.out.println("4 / 0 = " + operate(4, 0, div2));
    }
}
