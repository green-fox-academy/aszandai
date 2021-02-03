package com.greenfoxacademy.mysqltodos.repository;

import com.greenfoxacademy.mysqltodos.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    Assignee findFirstByName(String name);
}
