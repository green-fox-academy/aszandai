package com.example.springadvanced.service;

import com.example.springadvanced.dao.popular.PopularDAO;
import com.example.springadvanced.dto.popular.RootPopular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PopularService {

    @Autowired
    private PopularDAO popularDAO;

    public RootPopular fetchPopularMovies(String apiKey) throws IOException {
        return popularDAO.fetchPopularFilms(apiKey);
    }
}
