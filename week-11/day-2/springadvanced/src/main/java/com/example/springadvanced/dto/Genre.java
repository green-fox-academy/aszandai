package com.example.springadvanced.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public @Data class Genre{
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
}
