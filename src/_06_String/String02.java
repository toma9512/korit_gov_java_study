package _06_String;

public class String02 {
    public static void main(String[] args) {
        String s = "I like music and movie and travel.";

        // 특정 문자열 대체
        System.out.println(s.replace(" and", ","));
        System.out.println(s.replace(" ", ""));

        // 인덱스 기준 특정 위치부터 출력
        System.out.println(s.substring(7));
        System.out.println(s.substring(7,12)); // 7부터 11까지
        // 특정문자 문자열이 있는 위치부터 출력
        System.out.println(s.indexOf("movie"));
        System.out.println(s.substring(s.indexOf("movie"), s.indexOf(".")));

        s = "    I want go home    ";
        // 문자열의 앞뒤 공백 제거
        System.out.println(s.trim());

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat("!!").concat(s2));
    }
}
