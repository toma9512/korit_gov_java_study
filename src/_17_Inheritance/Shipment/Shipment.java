package _17_Inheritance.Shipment;

public class Shipment {
    String start;
    String end;

    public Shipment(String start,String end) {
        this.start = start;
        this.end = end;
    }

    public String route() {
        return start+" -> "+end;
    }

    public int calcFee(int weight, int distance) {
        return 0;
    }
}
