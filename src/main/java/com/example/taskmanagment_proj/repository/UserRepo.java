package com.example.taskmanagment_proj.repository;

import com.example.taskmanagment_proj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    @Query(value = "select  U from User U  ")
abstract List<User> getAllUser();
}
