package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public Todo[] getAllTodo() {
        return todos;
    }

    public int generateTodoId() {
        return (todos.length==0) ? 1 : todos[todos.length-1].getTodoId()+1;
    }

    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length+1];
        for (int i=0; i<todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length-1] = todo;
        todos = temp;
    }
}
