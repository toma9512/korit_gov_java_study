package _19_Interface.Zookeeper;

public class Zookeeper {
    // public void feed(Animal animal) {
    //     if (animal instanceof Tiger) {
    //         System.out.println("사과를 던져준다.");
    //     } else if (animal instanceof Lion) {
    //         System.out.println("바나나를 던져준다.");
    //     }
    // }

    public void feed(Predator predator) {
        System.out.println(predator.getFood() + "를 던져준다.");
    }
}
