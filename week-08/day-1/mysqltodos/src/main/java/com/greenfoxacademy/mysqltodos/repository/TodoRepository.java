package com.greenfoxacademy.mysqltodos.repository;

import com.greenfoxacademy.mysqltodos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
