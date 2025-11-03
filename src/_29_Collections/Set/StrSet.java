package _29_Collections.Set;

import java.util.*;

public class StrSet {
    /*
    Set은 순서도 없고, 중복도 허용하지 않는다
    List -> Set -> List 형변환이 중요
     */

    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Swift");
        strSet1.add("Swift");
        System.out.println(strSet1);

        strList1.addAll(strSet1);
        System.out.println(strList1);
        System.out.println(strList1.get(2));

        Collections.sort(strList1);
        System.out.println(strList1);

        Set<String> strSet2 = new HashSet<>(strList1);
        System.out.println(strSet2);

        // Set는 순서가 없어서 리스트로 변환한 뒤 정렬하고
        // Set로 다시 변환해도 의미가 없다.
        // Set는 오로지 중복 제거에 의미를 둔다.
    }
}
