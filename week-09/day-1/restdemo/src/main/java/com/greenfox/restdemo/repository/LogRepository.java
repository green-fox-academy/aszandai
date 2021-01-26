package com.greenfox.restdemo.repository;

import com.greenfox.restdemo.model.log.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
