package _20_Casting.Animals2;

public class Main {
    public static void main(String[] args) {
        Soundable s1 = new Dog();
        Soundable s2 = new Cat();

        s1.sound();
        s2.sound();

        Soundable s3 = new Soundable() {
            @Override
            public void sound() {
                System.out.println("삐약");
            }
        };
        s3.sound();
    }
}
