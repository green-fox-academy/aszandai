package com.greenfox.cheapreddit.service;

import com.greenfox.cheapreddit.model.User;
import com.greenfox.cheapreddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User userLogin(String name) {
        return userRepository.findByName(name);
    }
}
