package com.greenfoxacademy.mysqltodos.controller;

import com.greenfoxacademy.mysqltodos.model.Assignee;
import com.greenfoxacademy.mysqltodos.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping("/assignees")
    public String getAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping("/assignee/add")
    public String addTodoPage() {
        return "add-assignees";
    }

    @PostMapping("/assignee/add")
    public String addTodo(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping("/assignee/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignees";
    }

    @GetMapping("/assignee/{id}/edit")
    public String editTodo(@PathVariable Long id) {
        return "edit-assignees";
    }

    @PostMapping("/assignee/{id}/edit")
    public String editTodoSubmit(@PathVariable Long id, @ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }
}
