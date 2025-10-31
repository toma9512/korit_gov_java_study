package _27_Generic;

public class GenericEx {
    public static <T> T identify(T value) {
        System.out.println(value.getClass().getName());
        return value;
    }
}
