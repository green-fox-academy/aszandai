package com.example.springadvanced.service;

import com.example.springadvanced.dao.CountriesDAOImpl;
import com.example.springadvanced.model.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountriesService {

    @Autowired
    private CountriesDAOImpl genreDAO;

    public List<Countries> fetchGenres(String apiKey) throws IOException {
        return genreDAO.fetchGenres(apiKey);
    }
}
