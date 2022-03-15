package com.example.todo_rest_api_application.service.serviceImpl;

import com.example.todo_rest_api_application.entity.Task;
import com.example.todo_rest_api_application.repository.TaskRepository;
import com.example.todo_rest_api_application.service.TaskService;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;



    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> getAllTasks() {

        List<Task> allTodos =taskRepository.findAll();
        return allTodos;
    }

    @Override
    public Task getTaskById(Long id) {

        Task getTodoById = taskRepository.findById(id).get();
        return getTodoById;
    }

    @Override
    public Task saveTask(Task task) {

       Task saveTodo = taskRepository.save(task);

        return saveTodo;
    }

    @Override
    public Task updateTask(Task task) {

        Task updatingTodo = taskRepository.save(task);

        return updatingTodo;
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }
}
