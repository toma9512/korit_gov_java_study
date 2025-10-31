package _26_Singleton.Ex1;

public class Main {
    public static void main(String[] args) {
        Ex1 instance1 = Ex1.getInstance();
        Ex1 instance2 = Ex1.getInstance();
        System.out.println(instance1 == instance2);
    }
}
