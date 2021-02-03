package com.greenfoxacademy.mysqltodos.controller;

import com.greenfoxacademy.mysqltodos.model.Assignee;
import com.greenfoxacademy.mysqltodos.model.Todo;
import com.greenfoxacademy.mysqltodos.repository.AssigneeRepository;
import com.greenfoxacademy.mysqltodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;
    private final AssigneeRepository assigneeRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("/")
    public String redirectToTodo() {
        return "redirect:/todo";
    }

    @GetMapping("/todo")
    public String list(Model model, String name) {
        model.addAttribute("todos", todoRepository.findAll());
        assigneeRepository.findAll();

        return "todolist";
    }

    @GetMapping("/active-todos")
    public String activeTodos(Model model) {
        model.addAttribute("todos", todoRepository.findAllByIsDone(false));
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String addTodoPage(Model model) {
        model.addAttribute("assigneeList", assigneeRepository.findAll());
        return "add-todos";
    }

    @PostMapping("/todo/add")
    public String addTodo(@ModelAttribute Todo todo, String assignees) {
//        Assignee billy = new Assignee();
        Assignee assignee = assigneeRepository.findFirstByName(assignees);
        todo.setAssignee(assignee);
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("todo/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("todo/{id}/edit")
    public String editTodo(@PathVariable Long id, Model model) {
        model.addAttribute("todos", todoRepository.findAllByIsDone(false));
        model.addAttribute("assigneeList", assigneeRepository.findAll());
        return "edit-todos";
    }

    @PostMapping("todo/{id}/edit")
    public String editTodoSubmit(@PathVariable Long id, @ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @PostMapping("/search")
    public String searchBar(Model model, String search) {
        model.addAttribute("todos", todoRepository.findByTitleContaining(search));
        return "redirect:/todo";
    }
}
