package _16_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public void setName(String name) {
        System.out.println(name + "으로 이름을 변경합니다.");
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void showInfo() {
        System.out.printf("이름은 %s, 나이는 %d, 이메일은 %s, 주소는 %s\n",name, age, email, address);
    }
}
