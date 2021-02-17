package com.example.springadvanced.dto.authentication;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

public @Data class RequestNewToken {
    public boolean success;
    @SerializedName("guest_session_id")
    public String guestSessionId;
    @SerializedName("expires_at")
    public String expiresAt;
}
