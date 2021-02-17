package com.example.springadvanced.dto.review;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;

public @Data class ResultPreview {
    public String author;
    @SerializedName("author_details")
    public AuthorDetails authorDetails;
    public String content;
    @SerializedName("created_at")
    public Date createdAt;
    public String id;
    @SerializedName("updated_at")
    public Date updatedAt;
    public String url;
}
