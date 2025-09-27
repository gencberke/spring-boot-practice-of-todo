package com.berkedev.practicespringboottodoapp.data.mapper;

import com.berkedev.practicespringboottodoapp.data.dto.TodoCreateRequest;
import com.berkedev.practicespringboottodoapp.data.dto.TodoResponse;
import com.berkedev.practicespringboottodoapp.data.dto.TodoUpdateRequest;
import com.berkedev.practicespringboottodoapp.data.entity.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoMapper {

    /**
     * Usage: Returning data to client (GET requests)
     */
    public TodoResponse toTodoResponse(Todo todo) {
        if (todo == null) {
            return null;
        }

        return TodoResponse.builder()
                .setTitle(todo.getTitle())
                .setDescription(todo.getDescription())
                .setDueAt(todo.getDueAt())
                .setCreatedAt(todo.getCreatedAt())
                .setCompleted(todo.isCompleted())
                .setUpdatedAt(todo.getUpdatedAt())
                .build();
    }

    /**
     * Usage: Returning list of todos (GET /api/todos)
     * Note: This mapping should be done without using streams
     */
    public List<TodoResponse> toTodoResponseList(List<Todo> todos) {
        if (todos == null) {
            return null;
        }

        List<TodoResponse> todoListToResponse = new ArrayList<>();

        for (Todo todo : todos) {
            todoListToResponse.add(toTodoResponse(todo));
        }

        return todoListToResponse;
    }

    /**
     * Usage: Creating new todos (POST requests)
     */
    public Todo toTodoEntity(TodoCreateRequest todoCreateRequest) {
        if (todoCreateRequest == null) {
            return null;
        }

        return Todo.builder()
                .setTitle(todoCreateRequest.getTitle())
                .setDescription(todoCreateRequest.getDescription())
                .setDueAt(todoCreateRequest.getDueAt())
                .setCompleted(todoCreateRequest.isCompleted())
                .build();
    }

    /**
     * Usage: Updating existing todos (PUT/PATCH requests)
     */
    public void updateTodoFromRequest(Todo existingTodo, TodoUpdateRequest updateRequest) {
        if (updateRequest == null || existingTodo == null) {
            return;
        }

        if (updateRequest.getTitle() != null) {
            existingTodo.setTitle(updateRequest.getTitle());
        }

        if (updateRequest.getDescription() != null) {
            existingTodo.setDescription(updateRequest.getDescription());
        }

        if (updateRequest.getCompleted() != null) {
            existingTodo.setCompleted(updateRequest.getCompleted());
        }

        if (updateRequest.getDueAt() != null) {
            existingTodo.setDueAt(updateRequest.getDueAt());
        }
    }
}
