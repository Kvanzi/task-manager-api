package com.kvanzi.taskmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaskDto {
    private Long id;
    private String title;
    @JsonProperty("isCompleted")
    private boolean isCompleted;
}
