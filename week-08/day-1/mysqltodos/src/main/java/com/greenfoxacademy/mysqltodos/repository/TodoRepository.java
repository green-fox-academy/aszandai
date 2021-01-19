package com.greenfoxacademy.mysqltodos.repository;

import com.greenfoxacademy.mysqltodos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByIsDone(Boolean isDone);
    List<Todo> findByTitleContaining(String search);
}
