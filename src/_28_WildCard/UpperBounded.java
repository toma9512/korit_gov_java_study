package _28_WildCard;

/*
<? extends U> : 상한 경계 와일드 카드
상위 클래스 제한 (즉, U를 포함해서 그 자손들만 가능)
상한이 U
읽기는 가능하나 쓰기는 불가능
읽기 전용
 */

public class UpperBounded {
    public static void inspect(Box<? extends Dog> box) {
        Dog d = box.getValue();
        Animal a = box.getValue();
        // box.setValue(new Dog()); // 오류
        System.out.println(d);
    }
}
