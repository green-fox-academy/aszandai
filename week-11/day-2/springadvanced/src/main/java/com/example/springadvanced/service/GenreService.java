package com.example.springadvanced.service;

import com.example.springadvanced.dao.GenreDAO;
import com.example.springadvanced.dto.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GenreService {

    @Autowired
    private GenreDAO genreDAO;

    public Root fetchGenres(String apiKey) throws IOException {
        return genreDAO.fetchGenres(apiKey);
    }
}
