package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.TodoList;

import java.time.LocalDateTime;

public class TodoService {
    private TodoList todoList;
    private User principal;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void saveTodo(TodoRegisterReqDto todoRegisterReqDto) {
        Todo todo = todoRegisterReqDto.toEntity();
        todo.setTodoId(todoList.generateTodoId());
        todo.setCreateDt(LocalDateTime.now());
        todoList.add(todo);
    }

    public void printTodoListByUsername(User principal) {
        for (Todo todo : todoList.getAllTodo()) {
            if (todo.getUser().getUsername().equals(principal.getUsername())) {
                System.out.println(todo);
            }
        }
    }
}
