package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = "Java";
        String str2 = "Python";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str1.equalsIgnoreCase("java")); // 대소문자 무시

        str1 = "1234";
        str2 = "1234";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str1 = new String("1234");
        str2 = new String("1234");
        System.out.println(str1 == str2); // 메모리 주소값(참조 위치)이 다르므로 false
        System.out.println(str1.equals(str2)); // 내용 비교
    }
}
