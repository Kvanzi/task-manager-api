package com.kvanzi.taskmanager.exception;

public enum CustomErrorCode {
    TASK_NOT_FOUND;

    @Override
    public String toString() {
        return name();
    }
}
