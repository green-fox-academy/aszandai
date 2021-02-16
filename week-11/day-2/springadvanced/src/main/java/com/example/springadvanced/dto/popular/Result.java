package com.example.springadvanced.dto.popular;

import lombok.Data;

import java.util.List;


public @Data
class Result{
    public boolean adult;
    public List<Integer> genre_ids;
    public int id;
    public String original_language;
    public String original_title;
    public String overview;
    public double popularity;
    public String release_date;
    public String title;
    public double vote_average;
    public int vote_count;
}
