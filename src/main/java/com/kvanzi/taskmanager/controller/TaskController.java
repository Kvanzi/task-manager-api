package com.kvanzi.taskmanager.controller;

import com.kvanzi.taskmanager.dto.TaskDto;
import com.kvanzi.taskmanager.entity.Task;
import com.kvanzi.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskDto taskDto) {
        Task task = taskService.createTask(taskDto.getTitle(), taskDto.isCompleted());

        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping
    public ResponseEntity<Task> updateTask(@RequestBody TaskDto taskDto) {
        Task task = taskService.updateTask(taskDto.getId(), taskDto.getTitle(), taskDto.isCompleted());
        return ResponseEntity.ok(task);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();

        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
    }
}
