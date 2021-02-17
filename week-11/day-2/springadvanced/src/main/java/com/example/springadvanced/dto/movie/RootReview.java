package com.example.springadvanced.dto.movie;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

public @Data class RootReview {
    public int id;
    public List<ResultReview> results;
    @SerializedName("total_results")
    public int totalResults;
}
