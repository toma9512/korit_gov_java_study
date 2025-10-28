package _22_Bean;

/*
Bean
필드 속성들을 프로퍼티라고 하며, 해당 프로퍼티들은 private로 캡슐화가 되어있어야 한다.
그리고 캡슐화된 프로퍼티들은 getter, setter로만 접근 가능하다.
getter, setter들은 모두 다 public 이어야 한다.
데이터를 표현하는 것을 목적
 */

import java.time.LocalDateTime;

public class UserEntity {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private int statusCode;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(userId="+userId+", username="+username+", age="+age+", email="+email+")";
    }
}

// Entity
// 데이터베이스의 테이블과 1:1 매핑이 되는 클래스
// 자바 객체 <-> DB 테이블 간 데이터를 매핑하기 위해서 사용

// Entity는 왜 Bean?
// Bean은 일종의 가이드라인, 명세, 규칙

// 여기서 Entity가 Bean이 되려면 기본 생성자를 사용(NoArgs)
