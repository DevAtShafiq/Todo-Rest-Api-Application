package com.example.todo_rest_api_application.controller;
import com.example.todo_rest_api_application.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.todo_rest_api_application.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


@GetMapping("/")
public String  allTodos(Model model)

{
    model.addAttribute("allTasks", taskService.getAllTasks());
    return "todos";
}


    @GetMapping("/newTodo")
    public String addingNewTodo(Model model){

Task task = new Task();

        model.addAttribute("task",task);

        return "addTodoForm";
    }


    @PostMapping("/")
    public String savingTask(@ModelAttribute Task task)
    {

       taskService.saveTask(task);

        return "redirect:/";
    }


@GetMapping("/deleteById/{id}")
    public String deletingTask(@PathVariable("id") Long id)
    {
       taskService.deleteTaskById(id);

        return "redirect:/";
    }





}