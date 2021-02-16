package com.example.springadvanced.dto.genre;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public @Data class Genre{
    public int id;
    public String name;
}
