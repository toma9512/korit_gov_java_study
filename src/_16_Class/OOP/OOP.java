package _16_Class.OOP;

import _16_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (Object Oriented Programming)
        // - 현실 세계의 개념을 코드로 표현한 것
        // - 사람, 동물, 자동차 이런 것들을 하나의 객체로 본다.
        // - 여기에는 상태(속성)와 동작(기능)을 중심으로 프로그래밍한다.

        // OOP의 4가지 원칙
        // 1. 추상화 - 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것
        // 2. 캡슐화 - 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것(정보 은닉)
        // 3. 상속
        // 4. 다형성

        Person person1 = new Person();
        // person1.name = "d"; // name에 private이 걸려있으므로 접근 불가
        // person1.email = "";
        person1.setId("951224-1234567");
        System.out.println(person1.getId());
    }
}
