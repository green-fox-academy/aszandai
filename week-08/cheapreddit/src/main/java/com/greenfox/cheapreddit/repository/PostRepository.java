package com.greenfox.cheapreddit.repository;

import com.greenfox.cheapreddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query("SELECT post FROM Post post order by post.voteCount desc")
    List<Post> findTopPosts();


}
