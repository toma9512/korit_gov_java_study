package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is Heewon Jeong";

        System.out.println(s.length()); // 문자열의 길이

        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        System.out.println(s.contains("name")); // 포함 여부 (true or false)
        System.out.println(s.contains("age"));
        System.out.println(s.indexOf("name")); // 인덱스 위치
        System.out.println(s.indexOf("age")); // -1

        s = "I like music and movie and travel";
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and")); // 마지막 인덱스
        System.out.println(s.startsWith("I like"));; // 해당 문자열로 시작하는지 확인
        System.out.println(s.endsWith("travel")); // 해당 문자열로 끝나는지 확인
    }
}
