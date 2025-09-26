package com.berkedev.practicespringboottodoapp.data.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * purpose of this class is to define a to-do object that can be created by client. the fields that wrote down below are
 * will be given from client
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoCreateRequest {
    @NotBlank(message = "title required")
    private String title;
    private String description;
    private boolean completed = false;
    private LocalDateTime dueAt;

    /**
     * this builder not initialized by @Lombok's builder because I wanted to practice on how a builder works and how to
     * write an efficient builder without @Lombok's builder.
     */

    private TodoCreateRequest(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.completed = builder.completed;
        this.dueAt = builder.dueAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Setter
    public static class Builder {
        private String title;
        private String description;
        private boolean completed = false;
        private LocalDateTime dueAt;

        public TodoCreateRequest build() {
            return new TodoCreateRequest(this);
        }
    }
}
