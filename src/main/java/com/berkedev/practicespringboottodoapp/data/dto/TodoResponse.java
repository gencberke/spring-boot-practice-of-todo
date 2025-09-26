package com.berkedev.practicespringboottodoapp.data.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class TodoResponse {
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime dueAt;

    private TodoResponse(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.completed = builder.completed;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.dueAt = builder.dueAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Setter
    public static class Builder {
        private String title;
        private String description;
        private boolean completed;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime dueAt;

        public TodoResponse build() {
            return new TodoResponse(this);
        }
    }
}
