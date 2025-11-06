package _34_Lambda;

import java.util.*;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리", "수박", "포도");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(fruit -> System.out.println("과일 : "+ fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number * 2));
    }
}
