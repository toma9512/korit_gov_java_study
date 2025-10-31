package _28_WildCard;

/*
<? super U> : 하한 경계 와일드 카드
하위 클래스 제한 (U와 그 부모클래스들만 가능하다)
하한 U
쓰기는 가능하나 읽기는 Object로 받기
 */

public class LowerBounded {
    public static void putDog(Box<? super Dog> box) {
        // 읽기
        // Dog d = box.getValue(); // 컴파일 에러 (Box<Object>, Box<Animal>일 수도)
        Object o = box.getValue();
        System.out.println(o);

        // 쓰기
        box.setValue(new Dog());
        box.setValue(new Corgi()); // 가능
    }
}
