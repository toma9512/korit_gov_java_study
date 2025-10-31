package _27_Generic;

import lombok.Data;

/*
@Data
-> getter, setter, toString, RequiredArgsConstructor
 */

@Data
public class ResponseData<T> {
    private String message;
    private T data;

    @Override
    public String toString() {
        return message + data;
    }

    // public String toStringStr() {
    //     return message+data1;
    // }
    //
    // public String toStringInt() {
    //     return message+data2;
    // }
    //
    // public String toStringDouble() {
    //     return message+data3;
    // }
}

/*
Generic
클래스나 메소드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술
타입 매개변수
클래스나 메소드에서 사용할 실제 타입을 대신해서 사용하는 매개변수
T(Type) - 일반적으로 클래스타입을 나타낼 때 사용
E(Element) - 컬렉션의 요소를 나타낼 때 사용
K(Key) - Map의 Key를 나타낼 때 사용
V(Value) - Map의 Value 또는 제네릭 타입의 반환값으로 사용

재사용성
제네릭을 사용하면 다양한 자료형에 대해 하나의 클래스나 메소드를 정의할 수 있어
코드의 재사용성을 높이고 중복을 줄일 수 있다.

타입 안정성
컴파일 시 타입 체크가 가능하여, 잘못된 타입이 들어갈 수 없음
컴파일 시점에 타입 체크를 할 수 있어 프로그램의 안정성을 높이고, 명시적인 형변환(casting)을 줄임
 */