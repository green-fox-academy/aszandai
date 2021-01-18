package com.greenfoxacademy.sqltodos;

import com.greenfoxacademy.sqltodos.model.Todo;
import com.greenfoxacademy.sqltodos.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqltodosApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public SqltodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SqltodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Learn more dependency and ORM"));
        todoRepository.save(new Todo("Relax"));
        todoRepository.save(new Todo("Eat less pizza"));
        todoRepository.save(new Todo("Relax more"));
    }
}
