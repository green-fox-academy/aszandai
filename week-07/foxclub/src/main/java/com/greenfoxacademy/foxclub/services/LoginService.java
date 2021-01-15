package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private List<Fox> foxList = new ArrayList<>();
    private Fox currentName;

    public void addFox(Fox currentFox) {
        foxList.add(currentFox);
    }

    public String nameTheFox(Fox fox) {
        return fox.getName();
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public Fox getCurrentName() {
        return currentName;
    }

    public void setCurrentName(Fox currentName) {
        this.currentName = currentName;
    }
}
