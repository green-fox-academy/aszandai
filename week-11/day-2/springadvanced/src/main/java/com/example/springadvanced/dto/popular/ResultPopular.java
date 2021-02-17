package com.example.springadvanced.dto.popular;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;


public @Data
class ResultPopular {
    public boolean adult;
    @SerializedName("genre_ids")
    public List<Integer> genreIds;
    public int id;
    @SerializedName("original_language")
    public String originalLanguage;
    @SerializedName("original_title")
    public String originalTitle;
    public String overview;
    public double popularity;
    @SerializedName("release_date")
    public String releaseDate;
    public String title;
    @SerializedName("vote_average")
    public double voteAverage;
    @SerializedName("vote_count")
    public int voteCount;
}
