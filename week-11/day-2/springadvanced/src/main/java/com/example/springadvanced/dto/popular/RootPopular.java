package com.example.springadvanced.dto.popular;

import lombok.Data;

import java.util.List;

public @Data
class RootPopular {
    public int page;
    public List<Result> results;
    public int total_pages;
    public int total_results;
}
