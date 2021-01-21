package com.greenfox.cheapreddit.service;

import com.greenfox.cheapreddit.model.Post;
import com.greenfox.cheapreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PostService {
    private PostRepository postRepository;
    AtomicLong atomicLong = new AtomicLong(1);

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

    public int upVoteCount(Post post, Long id) {
        int count = (int) atomicLong.getAndIncrement();
        post.setVoteCount(count);
        return postRepository.save(post).getVoteCount();
    }
    public int downVoteCount(Post post, Long id) {
        int count = (int) atomicLong.getAndDecrement();
        post.setVoteCount(count);
        return postRepository.save(post).getVoteCount();
    }
}
