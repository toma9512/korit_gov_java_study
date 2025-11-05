package _32_LayeredArchitecture2.dto;

import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.util.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SigninReqDto {
    private String username;
    private String password;
}
