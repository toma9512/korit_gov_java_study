package _19_Interface.SmartDevice;

/*
인터페이스 상속받고 에어컨이랑 똑같이
속성으로 turnedOn이랑 brightness = 50;
고유 메소드로 밝기 올리는거 한개, 내리는거 한개
올리거나 내릴 때 전원이 켜져있어야 하며 10씩 증감
 */

public class SmartLight implements SmartDevice{
    boolean turnedOn;
    int brightness = 50;

    @Override
    public String getName() {
        return "스마트 조명";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원을 켭니다. 설정 밝기 : "+brightness);
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

    public void upBrightness() {
        if (turnedOn) {
            brightness += 10;
            System.out.println("현재 밝기 : "+brightness);
        } else {
            System.out.println(getName()+"의 전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }

    public void downBrightness() {
        if (turnedOn) {
            brightness -= 10;
            System.out.println("현재 밝기 : "+brightness);
        } else {
            System.out.println(getName()+"의 전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }
}
