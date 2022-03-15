package com.example.todo_rest_api_application.service;

import com.example.todo_rest_api_application.entity.Task;

import java.util.List;


public interface TaskService {

    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task saveTask(Task task);
    Task updateTask(Task task);

    void deleteTaskById(Long id);




}
