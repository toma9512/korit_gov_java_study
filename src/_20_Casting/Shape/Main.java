package _20_Casting.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
        System.out.println(circle.area());
        circle.render();

        Rectangle rectangle = new Rectangle(3.5,2);
        System.out.println(rectangle.area());
        rectangle.render();

        Triangle triangle = new Triangle(2.5, 4);
        System.out.println(triangle.area());
        triangle.render();
    }
}
