package _30_Json;

//{
//   "username": "gildong12",
//   "password": "q1w2e3!",
//   "email": "gildong12@naver.com",
//   "name": "홍길동",
//   "job": "국비",
//   "address": {
//     "city": "부산시",
//     "district": "부산진구",
//     "zipCode": "12345"
//   }
// }
// jsonObject 객체를 만들고 gsonBuilder를 이용해 json형태로 변환 후 위와 같이 출력

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject addressObject = new JsonObject();
        jsonObject.addProperty("orderId", "ORD123456");
        jsonObject.addProperty("customer", "곽두팔");
        jsonObject.addProperty("product", "에어팟 프로 2세대");
        jsonObject.addProperty("quantity", 1);
        jsonObject.addProperty("price", 349000);
        addressObject.addProperty("receiver","곽두팔");
        addressObject.addProperty("phone","010-5678-1234");
        addressObject.addProperty("city","서울");
        addressObject.addProperty("district","마포구");
        addressObject.addProperty("zipCode","04123");
        jsonObject.add("address",addressObject);
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
