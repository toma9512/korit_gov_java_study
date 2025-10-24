package _17_Inheritance.Shipment;

public class TruckShipment extends Shipment{
    public TruckShipment(String start, String end) {
        super(start, end);
    }

    @Override
    public int calcFee(int weight, int distance) {
        weight = Math.max(0, weight);
        distance = Math.max(0, distance);
        return 5000+weight*40+distance*30;
    }
}
