package _28_WildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Dog dog = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect(dogBox);
        Unbounded.inspect(catBox);

        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());
        UpperBounded.inspect(dogBox);
        UpperBounded.inspect(corgiBox);
        // UpperBounded.inspect(catBox); // 오류
        System.out.println("===");

        Box<Animal> animalBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        LowerBounded.putDog(animalBox);
        LowerBounded.putDog(objectBox);
        LowerBounded.putDog(dogBox);
    }
}
