package _23_Static.Person;

public class Person {
    public static int population = 0;
    final String COUNTRY1 = new String("korea"); // 객체 수준에서의 상수(객체 수준에서 변경 할 수 없음)
    static final String COUNTRY2 = "US"; // 클래스 전체에서 하나뿐인 상수
    final Student student = new Student();

    public Person() {
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구 수 : "+population);
        // 객체가 필요없이 호출이 가능한 메소드인데,
        // 안에서 쓰는 population 필드가 스태틱이 아니라면
        // 객체가 필요하기 때문에 접근할 수 없다.
    }
}
