package _18_Abstraction;

public class PhoneFactory extends Factory{
    // 추상클래스를 상속 받으면 반드시 추상메소드를 재정의 해줘야 한다.
    @Override
    public void produce(String model) {
        System.out.println("[ "+model+" ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 광장을 관리합니다.");
    }
}
