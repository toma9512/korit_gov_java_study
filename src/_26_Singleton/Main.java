package _26_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManager logManager1 = LogManager.getInstance(); // 객체 최초 생성
        LogManager logManager2 = LogManager.getInstance(); // logManager1과 같은 객체를 바라보게 됨
        logManager1.log("첫번째 로그 메시지");
        logManager2.log("두번째 로그 메시지");
        System.out.println(logManager1 == logManager2);
    }
}
