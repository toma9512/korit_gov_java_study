package _25_LayeredArchitecture.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
}
