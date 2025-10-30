package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    public User signin(SigninReqDto signinReqDto) {
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        if (foundUser == null) {
            // username을 가진 회원 없음
            return null;
        }
        if (!(foundUser.getPassword().equals(signinReqDto.getPassword()))) {
            // 비밀번호가 일치하지 않을 때
            return null;
        }
        // 비밀번호가 일치할 때
        return foundUser;
    }

    // username 중복 확인
    public boolean isDuplicatedUsername(String username) {
        // UserList에 대해 중복 확인
        return userList.findByUsername(username) != null;
    }

    // 회원 가입 정보 저장
    public void signup(SignupReqDto signupReqDto) {
        // 1. signupReqDto를 -> user (entity)
        User user = signupReqDto.toEntity();
        // 2. userId 생성
        user.setUserId(userList.generateUserId());
        // 3. user 배열에 추가
        userList.add(user);
    }

    // 회원정보 전체 출력
    public void printAllUserList() {
        System.out.println("[[ 회원 정보 전체 조회 ]]");
        for (User user : userList.getAllUser()) {
            System.out.println(user);
        }
    }
}
