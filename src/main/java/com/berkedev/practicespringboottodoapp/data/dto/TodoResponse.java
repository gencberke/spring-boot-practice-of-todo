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
    public static class Builder {
        private String title;
        private String description;
        private boolean completed;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime dueAt;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCompleted(boolean completed) {
            this.completed = completed;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setDueAt(LocalDateTime dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        public TodoResponse build() {
            return new TodoResponse(this);
        }
    }
}
