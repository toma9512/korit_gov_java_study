package _16_Class.Dog;

// 클래스의 정의
public class Dog {
    // 속성 -> 클래스의 필드
    String name;
    int age;
    String dogType;

    // 기능 -> class의 method
    public void callName() {
        System.out.println("왈왈");
    }

    public void showInfo() {
        System.out.println("[정보출력]");
        System.out.printf("이름은 %s, 나이는 %d, 견종은 %s\n",name,age,dogType);
    }
}
