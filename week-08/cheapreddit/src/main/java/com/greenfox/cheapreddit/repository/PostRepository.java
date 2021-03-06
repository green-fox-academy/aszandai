package com.greenfox.cheapreddit.repository;

import com.greenfox.cheapreddit.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query(value = "SELECT * FROM posts order by vote_count desc limit 10", nativeQuery = true)
    List<Post> findTopPostsNative();

//    @Modifying
//    @Query(value = "SELECT * FROM posts order by id asc limit 10 offset :page", nativeQuery = true)
    @Query(value = "SELECT * FROM posts order by id asc", nativeQuery = true)
    Page<Post> findPagePostsNative(Pageable pageable);

}
