package _16_Class.Person;

public class Person {
    private String name;
    private String email;
    private String address;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /*
    접근제어자
    1. public - 어디서든 접근 가능
    2. protected - 같은 패키지 또는 자식 클래스에서만 접근
    3. default(생략) - 같은 패키지에서만 접근 가능
    4. private - 해당 클래스 내부에서만 접근 가능
     */
}
