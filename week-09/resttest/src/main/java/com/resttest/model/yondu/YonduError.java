package com.resttest.model.yondu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YonduError {
    private String error;

    public YonduError() {
        this.error = "ERROR 500: That's an internal error my friend";
    }
}
