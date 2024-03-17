package com.example.taskmanagment_proj.controller;

import com.example.taskmanagment_proj.entity.Task;
import com.example.taskmanagment_proj.repository.TaskRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
     private final TaskRepo taskRepo;
     @GetMapping("/all")
    public List<Task> getAllTask()
     {
         return taskRepo.getAllTask();
     }
     @GetMapping("/search/{name}")
    public List<Task> searching(@RequestParam String name)
     {
         return taskRepo.getTaskByName(name);
     }
}
