package com.greenfoxacademy.mysqltodos.controller;

import com.greenfoxacademy.mysqltodos.model.Assignee;
import com.greenfoxacademy.mysqltodos.repository.AssigneeRepository;
import com.greenfoxacademy.mysqltodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

    private final AssigneeRepository assigneeRepository;
    private final TodoRepository todoRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    @GetMapping("/assignees")
    public String getAssignees(Model model, @ModelAttribute Assignee assignee) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping("/assignee/add")
    public String addAssigneePage() {
        return "add-assignees";
    }

    @PostMapping("/assignee/add")
    public String addAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping("/assignee/{id}/delete")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignees";
    }

    @GetMapping("/assignee/{id}/edit")
    public String editAssignee(@PathVariable Long id) {
        return "edit-assignees";
    }

    @PostMapping("/assignee/{id}/edit")
    public String editAssigneeSubmit(@PathVariable Long id, @ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }
}
