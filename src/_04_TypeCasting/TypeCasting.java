package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting

        // 정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        // double scoreDouble = scoreInt;
        // System.out.println(scoreDouble);

        // 실수 -> 정수
        float scoreFloat = 97.3F;
        System.out.println((int) scoreFloat); // 97, 소수점 버려짐

        double scoreDouble = 88.4;
        System.out.println((int) scoreDouble); // 88, 소수점 버려짐

        // double sum1 = 98 + 77.3;
        double sum1 = (double) 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int) 77.3;
        System.out.println(sum2);

        float sum3 = 98 + 77.3F;
        System.out.println(sum3);

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형 변환)

        int convertedScoreInt = (int) scoreDouble;
        // double -> float -> long -> int (수동 형 변환)

        long scoreLong = 87L;
        convertedScoreInt = (int) scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        // 숫자를 문자열로 변환
        int num1 = 55;
        String strNum1 = String.valueOf(num1); // 첫번째 방법
        strNum1 = Integer.toString(num1); // 두번째 방법
        // strNum1 = ""+55; // 데이터 유실 가능성 때문에 잘 사용하지 않음
        System.out.println(strNum1);

        double num2 = 55.55;
        String strNum2 = String.valueOf(num2);
        strNum2 = Double.toString(num2);

        float num3 = 56.34f;
        String strNum3 = String.valueOf(num3);
        strNum3 = Float.toString(num3);

        // 문자열을 숫자로
        int i = Integer.parseInt("34");
        System.out.println(i);
        double d = Double.parseDouble("34.44");
        System.out.println(d);
        float f = Float.parseFloat("34.1234F");
        System.out.println(f);

        // i = Integer.parseInt("숫자"); // 오류

        float floatNumber = 3.141592F;
        // 정수만 출력
        System.out.println((int) floatNumber);
    }
}
