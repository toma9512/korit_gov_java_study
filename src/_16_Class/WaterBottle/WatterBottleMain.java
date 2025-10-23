package _16_Class.WaterBottle;

/*
WaterBottle 패키지 만들고 WaterBottle 클래스
currentWater 물의 양 -> 속성
메소드 물 채우기 fill : 최대 용량 1000이상으로 채울 수 없음
메소드 물 마시기 drink : 현재 용량보다 초과해서 마실 수 없음
getter로 현재 물의 양 출력하기
객체 생성 시 빈 병
 */

public class WatterBottleMain {
    public static void main(String[] args) {
        WatterBottle wb = new WatterBottle();

        System.out.println(wb.getCurrentWater());

        wb.fill(1200);
        System.out.println(wb.getCurrentWater());
        wb.fill(500);
        System.out.println(wb.getCurrentWater());

        wb.drink(600);
        System.out.println(wb.getCurrentWater());
        wb.drink(300);
        System.out.println(wb.getCurrentWater());
    }
}
