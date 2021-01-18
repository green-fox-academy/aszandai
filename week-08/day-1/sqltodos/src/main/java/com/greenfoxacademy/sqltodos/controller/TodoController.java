package com.greenfoxacademy.sqltodos.controller;

import com.greenfoxacademy.sqltodos.model.Todo;
import com.greenfoxacademy.sqltodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
    @PostMapping("/list")
    public String addToList(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }


}
