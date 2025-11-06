package _34_Lambda;

//1. 스캐너 객체선언과 입력받아 저장할 Map선언(String, Integer)
//2. 상품을 입력할 갯수를 count로 입력받기(nextInt로)
//3. count만큼 반복하며 상품명(키)과 가격(값)으로 각각 입력받고 Map변수에 추가
//4. [상품 목록] 출력 후 람다식을 이용해서 forEach로 [상품명]: ***, [가격]: ***원 이런식으로 출력

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForEachMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<count; i++) {
            System.out.print((i+1)+"번째 상품명 >> ");
            String product = scanner.nextLine();
            System.out.print((i+1)+"번째 상품의 가격 >> ");
            int price = scanner.nextInt();
            scanner.nextLine();
            map.put(product, price);
        }
        System.out.println("[상품 목록]");
        map.forEach((key, value) -> System.out.println("[상품명]: "+key+", [가격]: "+value+"원"));
    }
}
