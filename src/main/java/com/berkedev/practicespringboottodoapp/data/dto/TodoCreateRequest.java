package com.berkedev.practicespringboottodoapp.data.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

/**
 * purpose of this class is to define a to-do object that can be created by client. the fields that wrote down below are
 * will be given from client
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoCreateRequest {
    @NotBlank(message = "title required")
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime dueAt;

}
