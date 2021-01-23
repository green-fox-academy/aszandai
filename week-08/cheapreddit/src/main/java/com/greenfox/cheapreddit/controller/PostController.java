package com.greenfox.cheapreddit.controller;

import com.greenfox.cheapreddit.model.Post;
import com.greenfox.cheapreddit.model.User;
import com.greenfox.cheapreddit.service.PostService;
import com.greenfox.cheapreddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage(Model model, @ModelAttribute User user, @RequestParam(defaultValue = "0", required = false) Integer page) {
        model.addAttribute("postList", postService.getPages(page));
        model.addAttribute("name", userService.userLogin(user.getName()));
        model.addAttribute("currentPage", page);
        model.addAttribute("pageCount", postService.getPageCount());

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

    @GetMapping("/post/{id}")
    public String getPostRead(@PathVariable long id, Model model) {
        model.addAttribute("title", postService.getPostById(id).getTitle());
        model.addAttribute("description", postService.getPostById(id).getDescription());
        return "postpage";
    }

    @GetMapping("/hotpage")
    public String hotPage(Model model) {
        model.addAttribute("topPostList", postService.getHotPosts());
        return "hotpage";
    }
}
