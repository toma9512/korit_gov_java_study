package _19_Interface.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
        zookeeper.feed(crocodile);
    }
}
