package com.greenfoxacademy.sqltodos.repository;

import com.greenfoxacademy.sqltodos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
