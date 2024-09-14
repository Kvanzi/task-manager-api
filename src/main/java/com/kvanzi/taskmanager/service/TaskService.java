package com.kvanzi.taskmanager.service;

import com.kvanzi.taskmanager.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(String title, boolean isCompleted);

    Task updateTask(Long id, String title, boolean completed);

    Task getTaskById(Long id);

    void deleteTaskById(Long id);

    List<Task> getAllTasks();
}
