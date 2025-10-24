package _17_Inheritance;

public class Main {
    public static void main(String[] args) {
        // 상속 - 기존 클래스(부모 클래스)의 속성과 기능(메소드)를
        //       새로운 클래스(자식 클래스)가 물려받는 것
        // - 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념
        // - 유지 보수 공통 기능이 한 곳(부모 클래스)에 있으므로, 수정할 일이 생기면
        //   부모 클래스 하나만 고치면 자식들 모두 반영됨
        // - 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다
        //  -> 개방 폐쇄 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다

        /*
        자식 클래스는 부모의 코드를 그대로 사용할 수 있다
        자식 클래스는 필요한 기능을 추가하거나, 변경(Overriding)도 가능
         */

        Animal animal1 = new Animal("호랑이", 5);
        animal1.move();

        Tiger tiger = new Tiger("호랭이", 6, true);
        tiger.move();
        tiger.hunt();

        System.out.println("----------");

        Human human = new Human();

        human.setAnimalName("홍길동");
        human.setAnimalAge(23);
        human.setLanguage("Korean");

        human.getAnimalName();
        human.getAnimalAge();

        human.move();
        human.read("1Q84");
    }
}
