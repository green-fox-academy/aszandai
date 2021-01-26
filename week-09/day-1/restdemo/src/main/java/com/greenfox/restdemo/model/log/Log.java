package com.greenfox.restdemo.model.log;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endpoint;
    private String data;
    private Timestamp createdAt;

    public Log(String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
        Date date = new Date();
        this.createdAt = new Timestamp(date.getTime());
    }
}
