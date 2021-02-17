package com.example.springadvanced.dto.movie;

import lombok.Data;

import java.util.List;

public @Data
class RootPopular {
    public List<ResultPopular> results;
}
