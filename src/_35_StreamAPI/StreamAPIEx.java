package _35_StreamAPI;

import java.util.*;

//1. 스캐너 객체 생성, product List하나 생성하면서
//"애플 아이폰 15 Pro",
//"애플 맥북 프로 M3",
//"애플 아이패드 에어 5세대",
//"애플 에어팟 프로 2세대",
//"삼성 갤럭시 S24 울트라",
//"삼성 갤럭시 Z 플립 5",
//"삼성 갤럭시탭 S9",
//"삼성 갤럭시 워치6",
//"삼성 노트북 갤럭시북4 프로",
//"엘지 울트라기어 게이밍 모니터" 제품들 넣기
//2. 브랜드 키워드 입력받기 => stream filter이용해서 키워드 브랜드 뽑아내고 List에 담기
// -> 삼성, 애플, 엘지 -> 영어로 입력해도 되도록
//3. 뽑아온 브랜드 상품들 출력 없으면 없다고 출력
public class StreamAPIEx {
    public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "애플 에어팟 프로 2세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 갤럭시탭 S9",
                "삼성 갤럭시 워치6",
                "삼성 노트북 갤럭시북4 프로",
                "엘지 울트라기어 게이밍 모니터"
        );

        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        if (target.equalsIgnoreCase("apple")) target = "애플";
        if (target.equalsIgnoreCase("samsung")) target = "삼성";
        if (target.equalsIgnoreCase("lg")) target = "엘지";

        String finalTarget = target;
        List<String> result = products.stream()
                .filter(n -> n.startsWith(finalTarget))
                .map(n -> n.substring(3))
                .toList();
        if (result.isEmpty()) System.out.println("상품이 없습니다.");
        else System.out.println(result);
    }
}