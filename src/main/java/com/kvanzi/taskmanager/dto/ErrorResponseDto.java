package com.kvanzi.taskmanager.dto;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private String message;
    private int statusCode;
    private String timestamp;
    private String error;
    private String errorCode;

    public ErrorResponseDto(String message, int statusCode, String timestamp, String error, String errorCode) {
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.error = error;
        this.errorCode = errorCode;
    }
}
