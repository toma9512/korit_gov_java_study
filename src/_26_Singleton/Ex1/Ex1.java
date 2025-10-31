package _26_Singleton.Ex1;

public class Ex1 {
    private static Ex1 instance;

    private Ex1() {}

    public static Ex1 getInstance() {
        if (instance == null) {
            instance = new Ex1();
        }
        return instance;
    }
}
