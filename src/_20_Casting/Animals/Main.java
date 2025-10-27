package _20_Casting.Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

        // 업 캐스팅 (자식 -> 부모 참조)
        Animal a = new Dog();
        a.speak();
        // a.wagTail(); // 부모를 참조하기 때문에 안됨

        // 다운 캐스팅 (부모 -> 자식)
        ((Dog) a).wagTail();

        Animal a2 = dog1;
        Dog dog2 = (Dog) a2;
        dog2.wagTail();

        // 다양한 자식들을 하나의 클래스 타입으로 처리할 수 있다.
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog[] dogs = {
                dog3,
                dog4,
                dog5
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();
        Animal[] animals = {
                dog, cat, tiger
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
