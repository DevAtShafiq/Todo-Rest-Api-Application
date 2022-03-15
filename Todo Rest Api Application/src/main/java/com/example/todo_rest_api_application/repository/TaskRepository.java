package com.example.todo_rest_api_application.repository;

import com.example.todo_rest_api_application.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{
}
