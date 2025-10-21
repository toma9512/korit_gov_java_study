package _15_Overloading;

public class OverloadingEx {
    public static void main(String[] args) {
        // max()
        // int 숫자 두개 중 더 큰 값 리턴
        // double 숫자 두개 중 더 큰 값 리턴
        System.out.println(max(1, 2));
        System.out.println(max(1.5, 2.2));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }
}
