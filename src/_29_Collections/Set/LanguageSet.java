package _29_Collections.Set;

// 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
//    이 요소들을 리스트에 넣기
// 2. 중복 제거한 후 출력하기
// 3. 오름차순 정렬된 상태 출력하기
// 4. 특정 과목 변수에 Java대입하고 맨 처음 만든 리스트에서 몇개 있는지 출력 (검색)
// 5. 중복 제거 한 뒤의 Set를 이용해서 중복 제거된 후의 언어 갯수 출력하기

import java.util.*;

public class LanguageSet {
    public static void main(String[] args) {
        // 1.
        List<String> list1 = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
        ));

        // 2.
        Set<String> set1 = new HashSet<>(list1);
        System.out.println("2. 중복 제거한 언어 : "+set1);

        // 3.
        List<String> list2 = new ArrayList<>(set1);
        Collections.sort(list2);
        System.out.println("3. 오름차순 정렬 : "+list2);

        // 4.
        String word = "Java";
        int count = 0;
        for (String language : list1) {
            if (language.equals(word)) count++;
        }
        System.out.println("4. Java의 갯수 : " + Collections.frequency(list1, word));
        System.out.println("4. Java의 갯수 : " + count);

        // 5.
        System.out.println("5. 중복제거한 언어 갯수 : " + set1.size());
    }
}
