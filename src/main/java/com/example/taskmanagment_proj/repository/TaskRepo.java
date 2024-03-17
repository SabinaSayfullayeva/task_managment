package com.example.taskmanagment_proj.repository;

import com.example.taskmanagment_proj.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task,Long> {
    @Query( nativeQuery = true ,value = "select t.* from task t ")
abstract List<Task> getAllTask();
@Query(nativeQuery = true ,value = "select t.* from task t where t.name ilike '%' || ?1 ||'%' ")
    abstract List<Task> getTaskByName(String name);
}
