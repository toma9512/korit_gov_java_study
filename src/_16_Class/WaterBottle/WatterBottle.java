package _16_Class.WaterBottle;

public class WatterBottle {
    private int currentWater=0;

    int getCurrentWater() {
        return currentWater;
    }

    void fill(int water) {
        if (water+currentWater > 1000) {
            System.out.println("최대 용량 1000을 초과했습니다.");
        } else {
            currentWater += water;
        }
        System.out.println("현재 물의 양 : "+currentWater);
    }

    void drink(int water) {
        if (currentWater < water) {
            System.out.println("마시려는 물이 현재 물의 양보다 많습니다.");
        } else {
            currentWater -= water;
        }
        System.out.println("현재 물의 양 : "+currentWater);
    }
}
