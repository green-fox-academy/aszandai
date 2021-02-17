package com.example.springadvanced.service;

import com.example.springadvanced.dao.guestauth.AuthenticationDAO;
import com.example.springadvanced.dto.guestauth.RequestNewToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GuestAuthenticationService {
    @Autowired
    private AuthenticationDAO authenticationDAO;

    public RequestNewToken fetchNewToken(String apiKey) throws IOException {
        return authenticationDAO.fetchNewToken(apiKey);
    }
}
