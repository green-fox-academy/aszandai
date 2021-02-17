package com.example.springadvanced.dto.review;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

public @Data class RootReview {
    public int id;
    public List<ResultPreview> results;
    @SerializedName("total_results")
    public int totalResults;
}
