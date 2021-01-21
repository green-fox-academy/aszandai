package com.greenfox.cheapreddit.service;

import com.greenfox.cheapreddit.model.Post;
import com.greenfox.cheapreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> postListFindAll() {
        return (List<Post>) postRepository.findAll();
    }

    public void upVoteCount(Post post) {
        int counter = 0;
        counter++;
        post.setVoteCount(counter);
    }
    public void downVoteCount(Post post) {
        int counter = 0;
        counter--;
        post.setVoteCount(counter);
    }
}
