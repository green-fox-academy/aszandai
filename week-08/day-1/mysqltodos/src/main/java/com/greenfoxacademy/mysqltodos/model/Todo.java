package com.greenfoxacademy.mysqltodos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "todo_id")
    private Long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "assignee_id", nullable = false)
    private Assignee assignee;
}
