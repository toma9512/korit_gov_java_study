package _14_Method;

public class MethodEx {
    public static int max(int num1, int num2, int num3) {
        int result;
        result = (num1 > num2) ? num1 : num2;
        result = (result > num3) ? result : num3;
        return result;
    }

    public static boolean isEven(int num) {
        return num%2 == 0;
    }

    public static int abs(int num) {
        return (num > 0) ? num : -num;
    }

    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 최댓값 구하기 (세 수를 전달)
        System.out.println(max(2, 41, 3));

        // 홀짝 판단 (boolean)
        System.out.println(isEven(4));

        // 절댓값 구하기(삼항 연산자 이용)
        System.out.println(abs(-2));
        System.out.println(abs(2));

        // 포함 여부(선형 탐색)
        System.out.println(contains(new int[] {1, 2, 3, 10}, 5));
        System.out.println(contains(new int[] {1, 2, 3, 10}, 3));
    }
}
