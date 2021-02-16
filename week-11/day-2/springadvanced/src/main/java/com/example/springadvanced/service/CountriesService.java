package com.example.springadvanced.service;

import com.example.springadvanced.dao.CountriesDAO;
import com.example.springadvanced.dto.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountriesService {

    @Autowired
    private CountriesDAO countriesDAO;

    public List<Countries> fetchCountries(String apiKey) throws IOException {
        return countriesDAO.fetchCountries(apiKey);
    }
}
