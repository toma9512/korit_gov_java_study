package _14_Method;

public class Return {
    public static String getName() {
        String name = "정희원";
        return name;
    }

    public static int getAge() {
        int age = 31;
        return age;
    }

    public static void main(String[] args) {
        // 반환값
        // void : 반환값이 없다.
        System.out.println(getName());

        int myAge = getAge();
        System.out.println(myAge);
    }
}
