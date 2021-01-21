package com.greenfox.cheapreddit.controller;

import com.greenfox.cheapreddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("postList", postService.postListFindAll());
        return "homepage";
    }

    @GetMapping("/submit")
    public String submitNewPost() {

        return "submitpage";
    }

}
