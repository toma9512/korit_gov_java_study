package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SigninReqDto;
import _32_LayeredArchitecture2.entity.User;

public interface SigninService {
    User signin(SigninReqDto signinReqDto);
    boolean isEmpty(String str);
}
