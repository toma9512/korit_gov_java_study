package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principal;
    private UserService userService;
    private TodoService todoService;

    public TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }

    public void homeView() {
        while (true) {
            System.out.println("[ Todo List ]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print("입력 >>> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                System.out.println("프로그램 종료");
                break;
            } else if ("1".equals(cmd) && principal == null) {
                System.out.println("로그인 후 사용 가능합니다.");
                continue;
            } else if ("1".equals(cmd) && principal != null) {
                // TodoList 관리
                todoListMenuView();
            } else if ("2".equals(cmd) && principal == null) {
                // 회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                // 로그아웃
                System.out.println("로그아웃");
                principal = null;
            } else if ("3".equals(cmd) && principal == null) {
                // 로그인
                signinView();
            } else {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }

    // 회원가입 뷰
    public void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while (true) {
            System.out.print("username >> ");
            username = scanner.nextLine();
            // username 중복 확인(중복이 되지 않았을 때 반복문 종료)
            if (!userService.isDuplicatedUsername(username)) { // 중복이 되지 않을 때
                System.out.println("사용 가능한 username 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username입니다.");
        }

        System.out.print("password >> ");
        String password = scanner.nextLine();

        System.out.print("name >> ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
        // userService의 회원가입 로직에 signupReqDto 전달
        userService.signup(signupReqDto);
        System.out.println("===== 회원가입 완료 =====");

        // 조회할 수 있는 로직
        userService.printAllUserList();
    }

    public void signinView() {
        System.out.println("[ 로그인 ]");
        System.out.print("username >> ");
        String username = scanner.nextLine();
        System.out.print("password >> ");
        String password = scanner.nextLine();
        SigninReqDto signinReqDto = new SigninReqDto(username, password);
        // 로그인 로직
        if (userService.signin(signinReqDto) == null) {
            System.out.println("username 또는 password가 일치하지 않습니다.");
            return;
        }
        System.out.println("=== 로그인 성공 ===");
        principal = userService.signin(signinReqDto);
    }

    public void todoListMenuView() {
        while (true) {
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">>> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("[ Todo 등록 ]");
                String content = null;
                while (true) {
                    System.out.print("content >> ");
                    content = scanner.nextLine();
                    if (content == null || content.isBlank()) {
                        System.out.println("content가 비어있습니다.");
                        continue;
                    }
                    break;
                }
                TodoRegisterReqDto todoRegisterReqDto = new TodoRegisterReqDto(content,principal);
                todoService.saveTodo(todoRegisterReqDto);
            } else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoService.printTodoListByUsername(principal);
            }
        }
    }
}
