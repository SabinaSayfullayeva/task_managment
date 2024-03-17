package com.example.taskmanagment_proj.controller;

import com.example.taskmanagment_proj.entity.User;
import com.example.taskmanagment_proj.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepo userRepo;
@GetMapping("/all")
    public List<User> userList()
{
    return userRepo.getAllUser();

}
}
