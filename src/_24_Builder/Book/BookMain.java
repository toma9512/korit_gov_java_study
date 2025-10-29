package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book.Builder()
                .bookId(1)
                .title("노인과 바다")
                .author("저자명")
                .isbn("123456789asdf")
                .build();
        System.out.println(book1.toString());
    }
}
