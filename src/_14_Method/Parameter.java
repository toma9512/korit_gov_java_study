package _14_Method;

public class Parameter {
    public static void power(int number) {
        System.out.println(number+"의 제곱은 "+number*number+"입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i=0; i<exponent; i++) result *= number;
        System.out.printf("%d의 %d제곱은 %d입니다.\n",number,exponent,result);
    }

    public static void getAverage(int num1, int num2, int num3) {
        double average = (num1+num2+num3)/3.0;
        System.out.printf("%d, %d, %d의 평균은 %f입니다.\n",num1,num2,num3, average);
    }

    public static void isOdd(int n) {
        String result = (n%2 == 0) ? "짝수" : "홀수";
        System.out.println(n+"은(는) "+result+"입니다.");
    }

    public static void main(String[] args) {
        power(4);
        powerByExp(3,4);

        // 세 개의 정수를 전달하여 평균을 출력하는 메소드 만들기
        getAverage(1,2,4);

        // 정수를 전달하여 짝수인지 홀수인지 판별 후 출력하는 메소드
        // 단, 삼항 연산자를 사용할 것
        isOdd(12514);
    }
}
