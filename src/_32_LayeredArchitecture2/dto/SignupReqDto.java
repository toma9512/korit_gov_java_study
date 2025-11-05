package _32_LayeredArchitecture2.dto;

import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.util.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupReqDto {
    private String username;
    private String password;
    private String confirmPassword;

    public User toEntity() {
        return User.builder()
                .userId(0)
                .username(username)
                .password(PasswordEncoder.encode(password))
                .build();
    }
}
