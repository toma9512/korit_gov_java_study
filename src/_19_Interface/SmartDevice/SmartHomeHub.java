package _19_Interface.SmartDevice;

/*
필드에 각 가전이 들어있음
고유 메소드로 turnOnAll : 모든 가전을 전원 킴
turnOffAll : 모든 가전의 전원을 끔
showStatus() : 모든 가전의 상태 출력
 */

public class SmartHomeHub {
    SmartAirConditioner smartAirConditioner;
    SmartLight smartLight;
    SmartSpeaker smartSpeaker;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }

    public void turnOnAll() {
        smartAirConditioner.turnOn();
        smartLight.turnOn();
        smartSpeaker.turnOn();
    }

    public void turnOffAll() {
        smartAirConditioner.turnOff();
        smartLight.turnOff();
        smartSpeaker.turnOff();
    }

    public void showStatus() {
        if (smartAirConditioner.isTurnedOn()) {
            System.out.println(smartAirConditioner.getName()+"의 전원이 켜져있습니다.");
        } else {
            System.out.println(smartAirConditioner.getName()+"의 전원이 꺼져있습니다.");
        }
        if (smartLight.isTurnedOn()) {
            System.out.println(smartLight.getName()+"의 전원이 켜져있습니다.");
        } else {
            System.out.println(smartLight.getName()+"의 전원이 꺼져있습니다.");
        }
        if (smartSpeaker.isTurnedOn()) {
            System.out.println(smartSpeaker.getName()+"의 전원이 켜져있습니다.");
        } else {
            System.out.println(smartSpeaker.getName()+"의 전원이 꺼져있습니다.");
        }
    }
}
