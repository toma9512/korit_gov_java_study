package _21_Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name+" 선생님의 "+schoolName+"수업 입니다.";
    }
    // 원래는 해시코드(참조 주소)를 반환하는데 읽기 편한 방식으로
    // 재정의해서 사용가능하다.


    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 현재 비교하는 객체가 같은 메모리 주소라면 자기 자신을 비교
            System.out.println("자기 자신");
            return true;
        }
        if (!(obj instanceof Teacher t)) return false; // 다운캐스팅
        return (this.name.equals(t.name) && this.schoolName.equals(t.schoolName));
    }
    // 두 객체의 참조 주소를 비교 -> 안의 값이 같은지(논리적으로 같은지)
    // 값 기반 비교로 오버라이딩


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // equals를 통해 같다라고 판별된 객체는 같은 해시코드를 가져야 한다는 자바의 공식 규칙
    // -> 반드시 같이 오버라이드를 해줘야 한다.
    // 하지만 hashCode를 오버라이드 할 경우 equals 오버라이드는 필수는 아니다.
}
