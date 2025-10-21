package _14_Method;

public class ParameterReturn {
    public static int power(int number) {
        return number*number;
    }

    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i=0; i<exponent; i++) result *= number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(12));
        System.out.println(powerByExp(2, 4));
    }
}
