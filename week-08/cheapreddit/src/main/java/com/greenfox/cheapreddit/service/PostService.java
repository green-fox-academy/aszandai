package com.greenfox.cheapreddit.service;

import com.greenfox.cheapreddit.model.Post;
import com.greenfox.cheapreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

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

    public Post getPostById(long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void upVoteCount(Post updatedPost, Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (!optionalPost.isPresent()) {
            throw new IllegalArgumentException();
        }

        Post post = optionalPost.get();
        updatedPost.setId(id);
        updatedPost.setTitle(post.getTitle());
        updatedPost.setDescription(post.getDescription());
        updatedPost.setVoteCount(post.getVoteCount() + 1);

        postRepository.save(updatedPost);
    }

    public void downVoteCount(Post updatedPost, Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (!optionalPost.isPresent()) {
            throw new IllegalArgumentException();
        }

        Post post = optionalPost.get();
        updatedPost.setId(id);
        updatedPost.setTitle(post.getTitle());
        updatedPost.setDescription(post.getDescription());
        updatedPost.setVoteCount(post.getVoteCount() - 1);

        postRepository.save(updatedPost);
    }

    public List<Post> getHotPosts() {
        return postRepository.findTopPostsNative();
    }
}
