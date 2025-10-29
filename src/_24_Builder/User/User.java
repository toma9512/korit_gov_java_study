package _24_Builder.User;

import lombok.Builder;
import lombok.ToString;

/*
 * int userId;
 * String username;
 * String password;
 * String email;
 * 빌더 패턴에 맞춰서 객체가 생성될 수 있도록
 * 이메일에 @이가 없다면 이메일 형식이 아닙니다. 출력(초기값 null 유지)
 * 최종적으로 객체가 생성될 때 username와 password필드가 없다면
 * username 필드 또는 password필드가 비어있습니다.를 출력(초기값 null 유지)
 * 그리고 toString 오버라이드 해서 객체의 필드가 모두 출력되도록 커스텀
 * */
@Builder
@ToString
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    // private User(Builder builder) {
    //     this.userId = builder.userId;
    //     this.username = builder.username;
    //     this.password = builder.password;
    //     this.email = builder.email;
    // }
    //
    // @Override
    // public String toString() {
    //     return "User(userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + ")";
    // }
    //
    // public static class Builder {
    //     private int userId;
    //     private String username;
    //     private String password;
    //     private String email;
    //
    //     public Builder userId(int userId) {
    //         this.userId = userId;
    //         return this;
    //     }
    //
    //     public Builder username(String username) {
    //         this.username = username;
    //         return this;
    //     }
    //
    //     public Builder password(String password) {
    //         this.password = password;
    //         return this;
    //     }
    //
    //     public Builder email(String email) {
    //         if (email == null || !email.contains("@")) {
    //             System.out.println("이메일 형식이 아닙니다.");
    //         } else {
    //             this.email = email;
    //         }
    //         return this;
    //     }
    //
    //     public User build() {
    //         if ((username == null || username.isBlank()) || (password == null || password.isBlank())) {
    //             System.out.println("username 필드 또는 password필드가 비어있습니다.");
    //         }
    //         return new User(this);
    //     }
    // }
}