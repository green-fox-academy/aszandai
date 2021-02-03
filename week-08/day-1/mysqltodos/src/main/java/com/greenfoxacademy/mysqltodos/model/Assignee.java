package com.greenfoxacademy.mysqltodos.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "assignee_id")
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todoList;
}
