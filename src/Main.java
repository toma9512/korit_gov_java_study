import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};

        System.out.println(Arrays.equals(arr, arr1));
        int[] temp = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.equals(arr, temp));
        System.out.println(arr == temp);
    }
}
