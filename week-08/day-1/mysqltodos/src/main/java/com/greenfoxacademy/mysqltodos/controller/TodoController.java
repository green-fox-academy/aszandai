package com.greenfoxacademy.mysqltodos.controller;

import com.greenfoxacademy.mysqltodos.model.Todo;
import com.greenfoxacademy.mysqltodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @ResponseBody
    @GetMapping("/")
    public String home() {
        return "Homepage";
    }

    @GetMapping("/todo")
    public String list(Model model, Todo todo) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping ("/active-todos")
    public String activeTodos (Model model){
        model.addAttribute("todos", todoRepository.findAllByIsDone(false));
        return "todolist";
    }

    @PostMapping("/list")
    public String addToList(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

}
