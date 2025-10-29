package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user1 = User.builder()
                .userId(1)
                .username("홍길동")
                .password("123")
                .email("qwe123@naver.com")
                .build();
        System.out.println(user1.toString());

        User user2 = User.builder()
                .userId(2)
                .username("김길동")
                .email("qwe123@daum.net")
                .build();
        System.out.println(user2.toString());

        User user3 = User.builder()
                .userId(3)
                .password("123")
                .email("qwe123@daum.net")
                .build();
        System.out.println(user3.toString());

        User user4 = User.builder()
                .userId(3)
                .username("김길동")
                .password("123")
                .email("qwe123")
                .build();
        System.out.println(user4.toString());
    }
}
