package _17_Inheritance.Shipment;

public class BikeShipment extends Shipment{
    public BikeShipment(String start, String end) {
        super(start, end);
    }

    @Override
    public int calcFee(int weight, int distance) {
        weight = Math.max(0, weight);
        distance = Math.max(0, distance);
        return 2000+weight*20+distance*50;
    }
}
