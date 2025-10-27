package _19_Interface.SmartDevice;

/*
SmartAirConditioner 클래스를 만들고 SmartDevice를 상속
고유 속성
bool turnedOn
int temperature = 24
getName : "스마트 에어컨" 리턴
turnOn : turnedOn = true;
"해당 가전 이름"의 전원을 켭니다. 설정 온도 **도 출력
turnOff : 반대로
isTurnedOn : 현재 전원상태 리턴

고유 메소드로 온도 올리는거 한개, 내리는거 한개
전원이 꺼져있으면 현재 전원이 꺼져있습니다 출력
 */

public class SmartAirConditioner implements SmartDevice{
    boolean turnedOn;
    int temperature = 24;

    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원을 켭니다. 설정온도 : "+temperature+"도");
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName()+"의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void upTemperature() {
        if (turnedOn) {
            temperature++;
            System.out.println("설정 온도 : " + temperature);
        } else {
            System.out.println(getName()+"의 전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }

    public void downTemperature() {
        if (turnedOn) {
            temperature--;
            System.out.println("설정 온도 : " + temperature);
        } else {
            System.out.println(getName()+"의 전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }
}
