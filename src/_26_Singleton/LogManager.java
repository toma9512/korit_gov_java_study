package _26_Singleton;

public class LogManager {
    // 싱글톤 (Singleton)
    // 애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    // 객체를 여러 번 만들 필요가 없고, 한 번만 만들고 재사용

    // 유일한 인스턴스를 담는 정적 변수
    // -> 객체 생성 없이 인스턴스를 담아두는 공간
    private static LogManager instance;

    // 생성자를 private로 막아서 외부에서 객체 생성 막기
    private LogManager() {}

    public static LogManager getInstance() {
        if (instance == null) {
            System.out.println("객체 생성됨");
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] "+message);
    }
}
