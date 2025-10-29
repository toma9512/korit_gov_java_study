package _24_Builder.Book;

/*
int bookId;
String title;
String author;
String isbn;
빌더 패턴 객체 생성
build() : title 또는 author가 비어있으면
title 필드 또는 author 필드가 비어있습니다. 출력 (객체는 생성)
isbn(String isbn) 호출 시 13자리가 아니라면
ISBN형식이 아닙니다. 출력 (null 값 유지)
toString 오버라이드 해서 모든 필드 출력
 */

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    private Book(Builder builder) {
        this.bookId = builder.bookId;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }

    @Override
    public String toString() {
        return "bookId : "+bookId+", title : "+title
                +", author : "+author+", isbn : "+isbn;
    }

    public static class Builder {
        private int bookId;
        private String title;
        private String author;
        private String isbn;

        public Builder bookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            if (isbn.length() != 13) {
                System.out.println("ISBN형식이 아닙니다.");
                this.isbn = null;
            } else {
                this.isbn = isbn;
            }
            return this;
        }

        public Book build() {
            if (title == null || author == null) {
                System.out.println("title 필드 또는 author 필드가 비어있습니다.");
            }
            return new Book(this);
        }
    }
}
