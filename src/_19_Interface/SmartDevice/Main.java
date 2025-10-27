package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();
        SmartLight smartLight = new SmartLight();
        SmartSpeaker smartSpeaker = new SmartSpeaker();

        smartAirConditioner.upTemperature();
        smartAirConditioner.turnOn();
        smartAirConditioner.downTemperature();

        smartLight.upBrightness();
        smartLight.turnOn();
        smartLight.downBrightness();

        smartSpeaker.play("힙합");
        smartSpeaker.turnOn();
        smartSpeaker.play("힙합");

        SmartHomeHub smartHomeHub = new SmartHomeHub(smartAirConditioner, smartLight, smartSpeaker);
        smartHomeHub.showStatus();
        smartHomeHub.turnOffAll();
        smartHomeHub.showStatus();
    }
}
