package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private List<Fox> foxList = new ArrayList<>();

    public void addFox(Fox fox) {
        foxList.add(fox);
    }

    public String nameTheFox(Fox fox) {
        return fox.getName();
    }

    public List<Fox> getFoxList() {
        return foxList;
    }
}
