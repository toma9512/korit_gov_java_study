package _19_Interface.Zookeeper;

public class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "사과";
    }
}
