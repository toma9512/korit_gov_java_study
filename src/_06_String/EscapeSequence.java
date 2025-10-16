package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'

        // \n : 개행(줄바꿈)
        System.out.println("집에\n너무\n가고싶어요");

        // \t : 탭 (공백 4칸)
        // 1.   페이커
        System.out.println("1.\t페이커");

        // \\ : 역슬래쉬를 문자열에 포함시키고 싶을 때
        // "C:\Program Files\java
        System.out.println("C:\\Program Files\\java");

        // \" : "를 문자열에 포함시키고 싶을 때
        // 손흥민의 팀은 "LA FC"이다.
        System.out.println("손흥민의 팀은 \"LA FC\"이다.");

        // \' : '를 문자열에 포함시키고 싶을 때
        // 페이커는 '신'이다.
        System.out.println("페이커는 '신'이다.");
        System.out.println("페이커는 \'신\'이다.");

        char c = 'A';
        c = '\'';
        System.out.println(c);

        // 문제
        String id = "951224-1234567";
        System.out.println(id.substring(0, id.indexOf("-")+2));
        System.out.println(id.substring(0, 8));
    }
}
