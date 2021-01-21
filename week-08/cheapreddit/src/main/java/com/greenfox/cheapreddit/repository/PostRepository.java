package com.greenfox.cheapreddit.repository;

import com.greenfox.cheapreddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
