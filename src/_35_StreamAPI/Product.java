package _35_StreamAPI;

/*
product -> name, price
브랜드명을 입력받고 최대 가격을 입력받는다
해당 브랜드의 상품 중 최대 가격보다 아래인 제품 목록 출력
만약 없다면 해당 조건에 맞는 제품이 없습니다. 출력
 */

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Product {
    String name;
    int price;
}
