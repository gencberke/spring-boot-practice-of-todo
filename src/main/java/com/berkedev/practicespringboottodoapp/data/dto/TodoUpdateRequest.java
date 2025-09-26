package com.berkedev.practicespringboottodoapp.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * purpose of this class is to define a to-do object that can be updated by client. the fields that wrote down below are
 * will be given from client
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoUpdateRequest {
    private String title;
    private String description;
    private Boolean completed;
    private LocalDateTime dueAt;
}
