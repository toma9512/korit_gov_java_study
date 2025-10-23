package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car(); // NoArgs
        Car santafe = new Car("붕붕이");
        System.out.println(santafe.carName);

        Car sorrento = new Car("쏘렌토", 2025, "검정색");
    }
}
