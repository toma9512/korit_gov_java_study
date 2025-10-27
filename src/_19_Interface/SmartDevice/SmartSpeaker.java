package _19_Interface.SmartDevice;

/*
인터페이스 상속받고 똑같이
속성으로 turnedOn, playListName = "발라드"
고유 메소드로 playListName을 파라미터로 받아서 해당 재생목록을 재생하는 메소드(속성 변경)
 */

public class SmartSpeaker implements SmartDevice{
    boolean turnedOn;
    String playListName = "발라드";

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원을 켭니다. 현재 플레이 리스트 : "+playListName);
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

    public void play(String playListName) {
        if (turnedOn) {
            this.playListName = playListName;
            System.out.println(playListName+"을 재생합니다.");
        } else {
            System.out.println(getName()+"의 전원이 꺼져있습니다. 전원을 켜주세요.");
        }
    }
}
