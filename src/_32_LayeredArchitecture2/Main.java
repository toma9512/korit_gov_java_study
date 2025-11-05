package _32_LayeredArchitecture2;

import _32_LayeredArchitecture2.dto.SigninReqDto;
import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl;
import _32_LayeredArchitecture2.service.SigninServiceImpl;
import _32_LayeredArchitecture2.service.SigninService;
import _32_LayeredArchitecture2.service.SignupService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SignupService signUpService = SignupService.getInstance();
        SigninService signinService = SigninServiceImpl.getInstance();
        Scanner scanner = new Scanner(System.in);
        User principal = null;

        while (true) {
            System.out.println("[회원관리 시스템]");
            if (principal == null) {
                System.out.println("1. 회원 가입");
                System.out.println("2. 로그인");
            } else {
                System.out.println("1. 내 정보 확인");
                System.out.println("2. 로그아웃");
            }
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print(">> ");
            String selectMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectMenu)) {
                System.out.println("프로그램 종료 중 ...");
                break;
            } else if ("1".equals(selectMenu) && principal == null) {
                System.out.println("[ 회원 가입 ]");
                SignupReqDto signupReqDto = new SignupReqDto();
                // username 중복 체크
                while (true) {
                    System.out.print("Username : ");
                    signupReqDto.setUsername(scanner.nextLine());
                    if (signUpService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 Username입니다.");
                }
                // 비밀번호 유효성 체크
                while (true) {
                    System.out.print("비밀번호 : ");
                    signupReqDto.setPassword(scanner.nextLine());
                    if (signUpService.isValidPassword(signupReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 재입력해주십시오.");
                }
                // 비밀번호와 비밀번호 확인이 같은지 확인
                while (true) {
                    System.out.print("비밀번호 확인 : ");
                    signupReqDto.setConfirmPassword(scanner.nextLine());
                    if (signUpService.isValidConfirmPassword(signupReqDto.getPassword(), signupReqDto.getConfirmPassword())) break;
                    System.out.println("입력하신 비밀번호와 일치하지 않습니다. 다시 입력해주십시오.");
                }

                signUpService.signup(signupReqDto);
                System.out.println("[[ 회원가입 완료 ]]");
            } else if ("1".equals(selectMenu)) {
                System.out.println(principal);
            } else if ("2".equals(selectMenu) && principal == null) {
                // SigninReqDto 객체 생성 후 로그인 정보 각각 입력받음 (단, isEmpty로 확인)
                // 유효성 검사 완료 후 signin() 호출
                System.out.println("[ 로그인 ]");
                SigninReqDto signinReqDto = new SigninReqDto();

                // username 유효성
                while (true) {
                    System.out.print("username 입력 : ");
                    signinReqDto.setUsername(scanner.nextLine());
                    if (!signinService.isEmpty(signinReqDto.getUsername())) break;
                    System.out.println("username은 공백일 수 없습니다.");
                }

                // password 유효성
                while (true) {
                    System.out.print("password 입력 : ");
                    signinReqDto.setPassword(scanner.nextLine());
                    if (!signinService.isEmpty(signinReqDto.getPassword())) break;
                    System.out.println("password는 공백일 수 없습니다.");
                }

                // 로그인 확인
                if (signinService.signin(signinReqDto) != null) {
                    principal = signinService.signin(signinReqDto);
                }
            } else if ("2".equals(selectMenu)) {
                principal = null;
                System.out.println("[[ 로그아웃 완료 ]]");
            } else if ("3".equals(selectMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
                System.out.println(UserRepositoryImpl.getInstance().toString());
            } else {
                System.out.println("메뉴를 다시 선택해주세요");
            }
        }
        System.out.println("프로그램 종료");
    }
}
