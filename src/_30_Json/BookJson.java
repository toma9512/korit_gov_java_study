package _30_Json;

import com.google.gson.*;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

/*
Book 클래스 만들고 객체 생성
isbn, title, author, price, publisher -> String
"978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
Book 객체 -> Json 문자열
json -> Map
Map -> pretty Json
Json -> book 객체
 */

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Book book = new Book("978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");
        String json = gson.toJson(book);
        System.out.println(json);
        Map<String, String> map = gson.fromJson(json, Map.class);
        String json1 = gson.toJson(map);
        Book book1 = gson.fromJson(json1, Book.class);
        System.out.println(book1);
    }
}
