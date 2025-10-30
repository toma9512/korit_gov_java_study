package _25_LayeredArchitecture;

import _25_LayeredArchitecture.repository.UserList;
import _25_LayeredArchitecture.service.UserService;
import _25_LayeredArchitecture.view.TodoListView;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList =new UserList();
        UserService userService = new UserService(userList);
        TodoListView todoListView = new TodoListView(userService);
        todoListView.homeView();
    }
}
