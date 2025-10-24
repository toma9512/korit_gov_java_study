package _17_Inheritance.Shipment;

/*
배송비 계산기
클래스 Shipment
속성은 출발지, 목적지
AllArgs 생성자
route() 메소드로 리턴 ex) "부산 -> 서울"
calcFee() 메소드 파라미터 무게와 거리 리턴은 그냥 0을 리턴
calcFee()는 자식 클래스에서 재정

자식 클래스 BikeShipment
AllArgs 생성자
calcFee(무게, 거리) 오버라이드 :
    기본금액(2000)에 무게당 20 + 거리당 50 반환
    만약, 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다

자식 클래스 TruckShipment
AllArgs 생성자
calcFee(무게, 거리) 오버라이드 :
    기본금액(5000)에 무게당 40 + 거리당 30 반환
    만약, 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 */

public class ShipmentMain {
    public static void main(String[] args) {
        Shipment sp1 = new Shipment("가","나");
        System.out.println(sp1.route());

        BikeShipment sp2 = new BikeShipment("다","라");
        System.out.println(sp2.route());
        System.out.println(sp2.calcFee(20,30));

        TruckShipment sp3 = new TruckShipment("마","바");
        System.out.println(sp3.route());
        System.out.println(sp3.calcFee(20,30));
    }
}
