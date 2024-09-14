package com.kvanzi.taskmanager.service.impl;

import com.kvanzi.taskmanager.entity.Task;
import com.kvanzi.taskmanager.exception.TaskNotFoundException;
import com.kvanzi.taskmanager.repository.TaskRepository;
import com.kvanzi.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(String title, boolean isCompleted) {
        Task task = mapTask(title, isCompleted);

        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, String title, boolean isCompleted) {
        Task task = mapTask(title, isCompleted);
        task.setId(id);

        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(String.format("Task with id %d not found", id)));
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    private Task mapTask(String title, boolean isCompleted) {
        Task task = new Task();
        task.setCompleted(isCompleted);
        task.setTitle(title);
        task.setCreationDate(LocalDate.now());

        return task;
    }
}
