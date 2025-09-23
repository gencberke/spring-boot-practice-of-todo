package com.berkedev.practicespringboottodoapp.data.dto;

import com.berkedev.practicespringboottodoapp.data.entity.Todo;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoCreateRequest {
    @NotBlank(message = "title required")
    private String title;
    private String description;
    private boolean completed = false;
    private LocalDateTime dueAt;

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

        public TodoCreateRequest build() {return new TodoCreateRequest(this);}
    }
}
