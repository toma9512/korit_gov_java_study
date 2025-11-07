package _35_StreamAPI;

/*
컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행

간결성 - 메소드 체이닝으로 인한 가독성 향상 및 간결해짐
함수형 프로그래밍
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사","김오","최오","최육","박칠" );

        // filter() : 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        System.out.println(namesWithKim);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // map() : 내부 요소들에게 각 메소드를 적용하는 형태
        List<Integer> multiNumbers = numbers.stream()
                .map(number -> number * 2)
                .toList();
        System.out.println(multiNumbers);

        List<String> englishNames = Arrays.asList("alice", "anya", "smith", "pascal", "bacon", "herry", "potter");

        // a로 시작하는 단어들로 거르고 모두 다 대문자로 변경하면서 정렬
        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase) // name -> name.toUpperCase()
                .sorted(Collections.reverseOrder()) // 내림차순
                .toList();
        // ::(메소드 레퍼런스) -> 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
        System.out.println(result);
        result.forEach(System.out::println);

        // englishNames에서 이름이 5글자 초과 되는 이름의 갯수
        // 일반적으로 for를 사용한 결과
        // 스트림을 이용한 결과
        int count1 = 0;
        for (String name : englishNames) {
            if (name.length() > 5) count1++;
        }

        int count2 = englishNames.stream().filter(name -> name.length() > 5).toList().size();
        long count3 = englishNames.stream().filter(name -> name.length() > 5).count();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
