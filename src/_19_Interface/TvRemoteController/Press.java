package _19_Interface.TvRemoteController;

/*
인터페이스는 기능(메소드)의 명세(규칙, 약속)만 정의하는 틀
객체 생성 불가능
기능 중심 설계
여러 클래스에서 같은 행동을 다르게 구현할 때
다형성을 극대화하고 싶을 때
 */

public interface Press {
    void onPressed();
}
