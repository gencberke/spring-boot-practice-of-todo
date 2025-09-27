package com.berkedev.practicespringboottodoapp.service;

import com.berkedev.practicespringboottodoapp.data.dto.TodoResponse;
import com.berkedev.practicespringboottodoapp.data.dto.TodoUpdateRequest;
import com.berkedev.practicespringboottodoapp.data.entity.Todo;

import java.util.List;

public interface  TodoService {
    List<TodoResponse> getAllTodos();

    TodoResponse getTodoById(Long id);

    TodoResponse createTodo(Todo todo);

    TodoResponse updateTodoById(Long id, Todo todo);

    TodoResponse updateTodoById(Long id, TodoUpdateRequest updateRequest);

    void deleteTodoById(Long id);
}
