package _29_Collections.List;

import java.util.*;

public class StrList {
    // collection
    // 여러 객체를 모아놓는 것

    // List - 순서가 있는 데이터의 집합, 중복된 요소를 허락한다.
    public static void main(String[] args) {
        // List<String> strList1 = new ArrayList<>();
        //
        // // 요소 추가
        // strList1.add("A");
        // strList1.add("B");
        // strList1.add("A");
        // System.out.println(strList1);

        List<String> strList1 = new ArrayList<>(Arrays.asList("A","B","A"));
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");
        System.out.println(strList2);
        System.out.println(strList2.get(3));

        // 특정 요소의 포함 여부 -> contains()
        String searchElem1 = "python";
        boolean containResult1 = strList2.contains(searchElem1);
        System.out.println(containResult1);

        String searchElem2 = "C";
        boolean containResult2 = strList2.contains(searchElem2);
        System.out.println(containResult2);

        String email = "example@naver.com";
        boolean containResult3 = email.contains("@");
        System.out.println(containResult3);

        // 요소 삭제
        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeResult1);

        // 오름차순 정렬
        Collections.sort(strList2);
        System.out.println(strList2);

        // 내림차순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println(strList2);

        // List의 길이
        System.out.println(strList2.size());

        // python 언어, javascript 언어, ..
        // 일반 for 문을 이용해서 뒤에 다 언어 붙여서 출력
        // foreach
        for (int i=0; i<strList2.size(); i++) {
            System.out.println(strList2.get(i)+" 언어");
        }

        for (String language : strList2) {
            System.out.println(language + " 언어");
        }


    }
}
