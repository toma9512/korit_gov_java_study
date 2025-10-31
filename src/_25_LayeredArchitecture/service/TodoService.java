package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.TodoList;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void register(TodoRegisterReqDto todoRegisterReqDto) {
        Todo todo = todoRegisterReqDto.toEntity();
        todo.setTodoId(todoList.generateTodoId());
        todoList.add(todo);
    }

    public void printAllTodoByUser(User user) {
        Todo[] foundTodos = todoList.findAllByUserId(user.getUserId());
        for (Todo todo : foundTodos) {
            System.out.println(todo.getContents());
        }
    }
}
