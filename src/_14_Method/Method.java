package _14_Method;

public class Method {
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        // 메소드
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
