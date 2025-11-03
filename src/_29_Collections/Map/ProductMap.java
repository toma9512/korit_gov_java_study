package _29_Collections.Map;

/*
1. 스캐너 객체 하나 생성하고 변수명이 productMap인 hashmap선언 (키는 String, 값은 Integer)
2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키) 입력받고 가격(값)입력 받고 map에 넣기
3. 전체 상품 출력 하기 -> 향상된 for문 순회하면서 "- 아이폰 17 : 1250000원" 출력
4. 상품 가격 수정 -> 수정할 상품명 입력받고 입력한 상품이 map에 있으면 수정할 가격 입력받고
    없으면 해당 상품이 없습니다 출력 -> 만약 수정 성공시 "가격이 수정되었습니다\." 출력
5. 특정 상품 검색 -> 검색할 상품명 입력받고 입력한 상품이 있으면 출력, 없으면 "해당 상품이 없습니다." 출력
6. 정렬하기 -> 키 기준 정렬 후 출력
7. 내림차순 정렬 -> 키 기준 내림차순 정렬 후 출력
 */

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {
        // 1.
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        // 2.
        System.out.println("상품 등록하기");
        for (int i=0; i<5; i++) {
            System.out.print((i+1)+"번째 상품명 : ");
            String product = scanner.nextLine();
            System.out.print((i+1)+"번째 상품의 가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine();
            productMap.put(product, price);
        }

        // 3.
        for (String key : productMap.keySet()) {
            System.out.println("- "+key+" => "+productMap.get(key)+"원");
        }

        // 4. 수정
        System.out.println("가격을 수정하려는 상품의 이름 입력");
        System.out.print(">> ");
        String target = scanner.nextLine();
        if (productMap.containsKey(target)) {
            System.out.print("수정 가격 >> ");
            int price = scanner.nextInt();
            scanner.nextLine();
            productMap.put(target, price);
            System.out.println("가격이 수정되었습니다.");
        } else {
            System.out.println("해당 상품이 없습니다.");
        }

        // 5.
        System.out.print("상품 검색 >> ");
        target = scanner.nextLine();
        if (!productMap.containsKey(target)) {
            System.out.println("해당 상품이 없습니다.");
        } else {
            System.out.println("해당 상품이 존재합니다.");
        }

        // 6.
        List<String> keyList = new ArrayList<>(productMap.keySet());
        Collections.sort(keyList);
        System.out.println("key 기준 오름차순 정렬");
        for (String key : keyList) {
            System.out.println("- "+key+" => "+productMap.get(key)+"원");
        }

        // 7.
        Collections.sort(keyList, Collections.reverseOrder());
        System.out.println("key 기준 내림차순 정렬");
        for (String key : keyList) {
            System.out.println("- "+key+" => "+productMap.get(key)+"원");
        }
    }
}
