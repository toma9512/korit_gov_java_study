package _32_LayeredArchitecture2.entity;

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
}
