package com.greenfox.cheapreddit.repository;

import com.greenfox.cheapreddit.model.Post;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Query(value = "SELECT * FROM posts order by vote_count desc limit 10", nativeQuery = true)
    List<Post> findTopPostsNative();

    @Modifying
    @Query(value = "SELECT * FROM posts order by id asc limit :pageLimit offset :pageOffset", nativeQuery = true)
    List<Post> findPagePostsNative(@Param("pageLimit") Integer pageLimit, @Param("pageOffset") Integer pageOffset);

}
