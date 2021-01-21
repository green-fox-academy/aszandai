package com.greenfox.cheapreddit.controller;

import com.greenfox.cheapreddit.model.Post;
import com.greenfox.cheapreddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/submitpage")
    public String submitNewPostPage() {
        return "submitpage";
    }

    @PostMapping("/submitpage")
    public String submitNewPostAction(@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/";
    }

    @PostMapping("/upvote/{id}")
    public String upVotePressed(@ModelAttribute Post post, @PathVariable Long id) {
        postService.upVoteCount(post, id);
        return "redirect:/";
    }

    @PostMapping("/downvote/{id}")
    public String downVotePressed(@ModelAttribute Post post, @PathVariable Long id) {
        postService.downVoteCount(post, id);
        return "redirect:/";
    }

}
