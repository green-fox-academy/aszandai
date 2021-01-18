package com.greenfoxacademy.mysqltodos.controller;

import com.greenfoxacademy.mysqltodos.model.Todo;
import com.greenfoxacademy.mysqltodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String list(Model model, Todo todo) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @GetMapping ("/active-todos")
    public String activeTodos (Model model){
//        model.addAttribute("todos", todoRepository.findAllByIsDone(false));
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String addTodoPage() {
        return "addtodos";
    }

    @PostMapping("/todo/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id) {
        return "edit";
    }
    @PostMapping("/{id}/edit")
    public String editTodoSubmit(@PathVariable Long id, @ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }
}
