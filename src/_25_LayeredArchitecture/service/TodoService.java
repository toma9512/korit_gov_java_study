package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.TodoList;

import java.time.LocalDateTime;

public class TodoService {
    TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void todoRegister(TodoRegisterReqDto todoRegisterReqDto) {
        Todo todo = todoRegisterReqDto.toEntity();
        todo.setTodoId(todoList.generateTodoId());
        todo.setCreateDt(LocalDateTime.now());
        todoList.add(todo);
    }

    public void printTodoListByUser(User principal) {
        Todo[] todos = todoList.getAllTodos();
        for (Todo todo : todos) {
            if (todo.getUser().getUsername().equals(principal.getUsername())) {
                System.out.println(todo.getContents());
            }
        }
    }
}
