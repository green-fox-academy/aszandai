package com.example.springadvanced.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public @Data class Countries {
    @SerializedName("iso_3166_1")
    public String iso_3166_1;
    @SerializedName("english_name")
    public String english_name;
}
